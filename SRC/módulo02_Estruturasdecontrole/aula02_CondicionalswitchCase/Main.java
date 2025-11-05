package módulo02_Estruturasdecontrole.aula02_CondicionalswitchCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*; 
/*
============================================
        1° PASSO: Definição de Enum
============================================
*/
enum NivelDesempenho implements Serializable {
    ALTO, MODERADO, BAIXO
}

/*
===================================================
      2°PASSO: Classe linguagens (Objeto no Vetor)
===================================================
*/
class LinguagemInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String nome;
    private final String tipagem;
    private final NivelDesempenho desempenho;
    private final String usoPrincipal;
    private final String sugestaoPortifolio;

    public LinguagemInfo(String nome, String tipagem, NivelDesempenho desempenho, String usoPrincipal, String sugestaoPortifolio) {
        this.nome = nome;
        this.tipagem = tipagem;
        this.usoPrincipal = usoPrincipal;
        this.sugestaoPortifolio = sugestaoPortifolio;
        this.desempenho = desempenho;
    }

    public String getNome() {return nome; }
    public String getTipagem() {return tipagem; }
    public String getUsoPrincipal() {return usoPrincipal; }
    public NivelDesempenho getDesempenho() {return desempenho; }
    public String getSugestaoPortifolio() {return sugestaoPortifolio; }

    public String gerarRelatorio() {
        return String.format(
                "Linguagem: %s\n" +
                        "Tipagem: %s\n" +
                        "Desempenho: %s\n" +
                        "Uso Principal: %s\n" +
                        "Sugestão de Projeto Para Portifólio: %s\n",
                this.nome, this.tipagem, this.desempenho, this.usoPrincipal, this.sugestaoPortifolio
        );
    }
}


public class Main {

    private static final String ARQUIVO_LINGUAGENS = "linguagens.dat";


    private static final List<LinguagemInfo> LINGUAGENS_SUPORTADAS = carregarLinguagens();

    // =================================================================
    // MÉTODOS DE PERSISTÊNCIA (CARREGAR E SALVAR)
    // =================================================================
    @SuppressWarnings("unchecked")
    private static List<LinguagemInfo> carregarLinguagens() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO_LINGUAGENS))) {
            System.out.println("[INFO] Dados de linguagens carregados do arquivo.");
            return (List<LinguagemInfo>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("[INFO] Arquivo de dados não encontrado. Usando lista padrão.");
            // Lista Padrão de Inicialização
            return new ArrayList<>(Arrays.asList(
                    new LinguagemInfo("Java", "Estática e Forte", NivelDesempenho.ALTO,
                            "Sistemas empresariais, Backend, Android", "Criar uma API RESTful com Spring Boot."),
                    new LinguagemInfo("Python", "Dinâmica e Forte", NivelDesempenho.MODERADO,
                            "Data Science, Machine Learning, Scripts", "Criar um modelo de ML usando scikit-learn."),
                    new LinguagemInfo("JavaScript", "Dinâmica e Fraca", NivelDesempenho.MODERADO,
                            "Frontend, Fullstack (Node.js)", "Desenvolver uma SPA (Single Page Application) com React.")
            ));
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("[ERRO] Falha ao carregar dados: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    private static void salvarLinguagens() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO_LINGUAGENS))) {
            oos.writeObject(LINGUAGENS_SUPORTADAS);
            System.out.println("\n[INFO] Dados de linguagens salvos com sucesso.");
        } catch (IOException e) {
            System.err.println("[ERRO] Falha ao salvar dados: " + e.getMessage());
        }
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println(" ANALISADOR DE LINGUAGENS DE PROGRAMAÇÃO  ");
        System.out.println("==========================================");

        exibirMenuLinguagens();

        System.out.print("\nDigite o nome da linguagem para análise: ");
        String nomeLinguagem = sc.nextLine();


        String linguagemFormatada = nomeLinguagem.trim().toLowerCase();

        try {
            String relatorioLinguagem = analisarLinguagem(linguagemFormatada);
            System.out.println("======================================");
            System.out.println("          RELATÓRIO DE LINGUAGEM      ");
            System.out.println("======================================");
            System.out.println(relatorioLinguagem);
            System.out.println("======================================");


            System.out.print("Deseja adicionar uma nova linguagem ao relatório? (Sim/Não) ");
            String novaLinguagemEscolha = sc.nextLine();

            if (novaLinguagemEscolha.trim().equalsIgnoreCase("sim") || novaLinguagemEscolha.trim().equalsIgnoreCase("s")) {
                adicionarNovaLinguagem(sc, linguagemFormatada);
                System.out.println("----------Nova Linguagem Adicionada com Sucesso-------");
                exibirMenuLinguagens();
            }

        } catch(IllegalArgumentException e){
            System.out.printf("[ERRO DE ANÁLISE]: %s\n", e.getMessage());
            System.out.print("\nLinguagem não encontrada. Gostaria de adicionar ela à lista de linguagens? (Sim/Não) ");

            String escolha = sc.nextLine().trim().toLowerCase();

            if (escolha.equals("sim") || escolha.equals("s")) {
                String novoRelatorio = adicionarNovaLinguagem(sc, linguagemFormatada);
                System.out.println("----------Nova Linguagem Adicionada com Sucesso-------");
                System.out.println(novoRelatorio);
            } else {
                System.out.println("\nAnálise Finalizada! Até Mais");
            }
        } finally{
            sc.close();
            salvarLinguagens();
        }
    }

    /*
    =======================================================
    3° PASSO: Definição de Menu
    =======================================================
    */
    public static void exibirMenuLinguagens() {
        System.out.println("\n=============================================");
        System.out.println("            MENU DE LINGUAGENS               ");
        System.out.println("=============================================");
        int i = 1;
        for (LinguagemInfo info : LINGUAGENS_SUPORTADAS) {
            System.out.printf("%d. %-15s |\n", i++, info.getNome());
        }
        System.out.println("=============================================");
    }


    /*
    =======================================================
    4° PASSO: Listagem de Linguagens
    =======================================================
    */
    public static String analisarLinguagem(String linguagemBusca) {

        for(LinguagemInfo info: LINGUAGENS_SUPORTADAS){

            if(info.getNome().toLowerCase().equals(linguagemBusca) || info.getNome().toLowerCase().startsWith(linguagemBusca)){
                return info.gerarRelatorio();
            }
        }

        throw new IllegalArgumentException("A linguagem: " + linguagemBusca + " não está mapeada.");
    }


    /*
   =======================================================
   5° PASSO: Função de adição de nova Linguagem
   =======================================================
   */

    public static String adicionarNovaLinguagem(Scanner scanner, String nomeLinguagemChave) {
        System.out.println("=========================================== ");
        System.out.println("         RELATÓRIO DE NOVA LINGUAGEM        ");
        System.out.println("=========================================== ");


        System.out.print("Informe o nome da Nova Linguagem: ");
        String nomeNovaLinguagem = scanner.nextLine();

        System.out.print("Informe pelo menos duas tipagens (Ex: Estática e Fraca) da Nova Linguagem: ");
        String tipagemNovaLinguagem = scanner.nextLine();

        NivelDesempenho desempenho= null;
        while ( desempenho == null) {
            System.out.print("Informe o nível de Desempenho (ALTO, MODERADO, BAIXO): ");
            String inputDesempenho = scanner.nextLine().trim().toUpperCase();

            try{
                desempenho = NivelDesempenho.valueOf(inputDesempenho); // Tenta a conversão
            }catch (IllegalArgumentException e){
                System.out.println("Opção Inválida. Digite um nível válido: (ALTO, MODERADO, BAIXO)");
            }
        }

        System.out.print("Informe o uso principal da linguagem: ");
        String usoPrincipalLinguagem = scanner.nextLine();

        System.out.print("Informe uma sugestão de Projeto utilizando esta linguagem: ");
        String sugestaoLinguagem = scanner.nextLine();

        LinguagemInfo novoRelatorio = new LinguagemInfo(
                nomeNovaLinguagem,
                tipagemNovaLinguagem,
                desempenho,
                usoPrincipalLinguagem,
                sugestaoLinguagem
        );


        LINGUAGENS_SUPORTADAS.add(novoRelatorio);
        System.out.println(">>Linguagem adicionada com Sucesso<<");
        return novoRelatorio.gerarRelatorio();
    }
}
package módulo02_Estruturasdecontrole.aula02_CondicionalswitchCase;

/*
===============================
OBJETIVO FINAL DO PROJETO:
===============================
Título: Analisador de Linguagem de Programação

1.Exibir uma lista de linguagens presentes utilizando arrays,objects e class
2.Pedir uma linguagem pré listada
3.Exibir uma descrição individual detalhada da linguagem escolhida utilizando for each
4.Listar analise destas linguagens utilizando uma estrutura Switch case
5.Caso a linguagem que o usuario tenha digitado não esteja listada abrirá uma bifurcação de escolha para o usuário
6.Implementação da funcionalidade "Adicionar Linguagem?" (Sim/Não)
7.Caso a resposta do usuário seja sim,deve adionar um campo de input para preenchimento de informações da linguagem,seguindo o padrão de listagem anterior]
8.Caso a resposta seja não,o código termina.
 */
import java.util.Scanner;



/*
============================================
        1° PASSO: Definição de Enum 
============================================
*/

    enum NivelDesempenho {
        ALTO, MODERADO, BAIXO
    }



/*
==============================================
           2°PASSO: Fluxo Global (Main)
==============================================
*/
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println(" ANALISADOR DE LINGUAGENS DE PROGRAMAÇÃO  ");
        System.out.println("==========================================");


        
        System.out.println("Digite o nome da linguagem para análise:  ");
        String nomeLinguagem = sc.next();


        String linguagemFormatada = nomeLinguagem.trim().toLowerCase();

        try {
            String relatorioLinguagem = analisarLinguagem(linguagemFormatada);
            System.out.println("======================================");
            System.out.println("          RELATÓRIO DE LINGUAGEM      ");
            System.out.println("======================================");
            System.out.println(relatorioLinguagem);
            System.out.println("======================================");
            System.out.println("Deseja adicionar uma nova linguagem ao relatório? (Sim/Não)");
            String novaLinguagem = sc.next();
            if (novaLinguagem.trim().equalsIgnoreCase("sim") || novaLinguagem.trim().equalsIgnoreCase("s")) {
                Scanner sc2 = new Scanner(System.in);
                String novoRelatorioLinguagem = sc2.nextLine();
                System.out.println("----------Nova Linguagem Adicionada com Sucesso-------");
                System.out.println(novoRelatorioLinguagem);
            }

            } catch(IllegalArgumentException e){
                System.out.printf("[ERRO DE ANÁLISE]: %s\n", e.getMessage());
                System.out.println("\n Linguagem não encontrada. Gostaria de adicionar ela à lista de linguagens? (Sim/Não)");
                String escolha = sc.next().trim().toLowerCase();
                if (escolha.equals("sim") || escolha.equals("s")) {
                    Scanner scNL = new Scanner(System.in);
                    String novoRelatorio = adicionarNovaLinguagem(linguagemFormatada, scNL);
                    System.out.println("----------Nova Linguagem Adicionada com Sucesso-------");
                    System.out.println(novoRelatorio);
                } else {
                    System.out.printf("\n Análise Finalizada! Até Mais");
                }
            } finally{
                sc.close();
            }


    }


    /*
    =======================================================
    3° PASSO: Listagem de Linguagens com Switch Case
    =======================================================
    */

    public static String analisarLinguagem(String linguagem) {

        String resultado = switch (linguagem) {

            case "java", "jdk" -> {
                String detalhesLinguagem = String.format(
                        "Linguagem: Java\nTipagem: Estática e Forte\n Desempenho %s\n" +
                        "Uso Principal: Sistemas empresariais, Backend, Android" +
                        "Sugestão de Portifólio: Criar uma API RESTful com Spring Boot.",
                        NivelDesempenho.ALTO
                );
                yield detalhesLinguagem;
            }
            case "JavaScript", "js", "javascript" -> {
                String detalhesLinguagem = String.format(
                        "Linguagem: JavaScript\n" +
                        "Tipagem: Flexível e Fraca " +
                        "Desempenho %s\n" +
                        "Uso Principal: Aplicações web,Frontend, Fullstack\n" +
                        "Sugestão de Portifólio: Criar uma landing page com react e node.js",
                        NivelDesempenho.ALTO
                );
                yield detalhesLinguagem;

            }

            case "Python", "python" -> {
                String detalhesLinguagem = String.format(
                        "Linguagem: Python\n" +
                        "Tipagem:  Dinâmica e Forte\n" +
                        "Desempenho: %s\n" +
                        "Uso Principal: Data Science,Machine Learning, Scripts" +
                        "Sugestão de Portifólio: Criar um modelo de ML usando scikit-learn.",
                        NivelDesempenho.ALTO
                );
                yield detalhesLinguagem;
            }


            default -> throw new IllegalArgumentException("A linguagem: " + linguagem + "não está mapeada.");


        };
        return resultado;
    }


    /*
   =======================================================
   4° PASSO: Função de adição de nova Linguagem
   =======================================================
   */
    public static String adicionarNovaLinguagem(String novaLinguagem, Scanner scanner) {
        System.out.println("=========================================== ");
        System.out.println("         RELATÓRIO DE NOVA LINGUAGEM        ");
        System.out.println("=========================================== ");

        System.out.println("Informe o nome da Nova Linguagem: ");
        String nomeNovaLinguagem = scanner.next();

        System.out.println("Informe a tipagem (Ex: Estática,Dinâmica,Forte,Fraca) da Nova Linguagem: ");
        String tipagemNovaLinguagem = scanner.next();

        NivelDesempenho desempenho= null;
        String desempenhoNovaLinguagem  = scanner.next().trim().toUpperCase();
        while (desempenho == null) {
            System.out.println("Informe o nível de Desempneho (ALTO, MODERADO, BAIXO): ");
            desempenhoNovaLinguagem = scanner.nextLine().trim().toUpperCase();
        }
        try{
            desempenho = NivelDesempenho.valueOf(desempenhoNovaLinguagem);
        }catch (IllegalArgumentException e){
            System.out.println("Opção Inválida. Digite um nível válido: (ALTO, MODERADO, BAIXO)");
        }

        System.out.println("Informe o uso principal da linguagem: ");
        String usoPrincipalLinguagem = scanner.next();

        System.out.println("Informe uma sugestão de Projeto utilizando esta linguagem: ");
        String sugestaoLinguagem = scanner.next();

        String novoRelatorio = String.format(

                "Linguagem: %s" +
                "Tipagem: %s"   +
                "Desempenho: %s" +
                "Uso Principal: %s" +
                "Sugestão de Projeto p/ portifólio: %s ",

                nomeNovaLinguagem.toUpperCase(),
                tipagemNovaLinguagem,
                desempenho,
                usoPrincipalLinguagem,
                sugestaoLinguagem
        );


        return novoRelatorio;
    }
}




package módulo02_Estruturasdecontrole.aula01_EstruturaCondicional;


/*
  /________________$OBJETIVO FINAL DO CÓDIGO:$_____________________/
  # TÍTULO:Sistema de Classificação de Senioridade em Java
  1.Recebe os dados do Candidato para processo de métrica
  2.Armazena essas informações em variáveis e as compara com constantes já pré-definidas
  4.Exibe uma legenda para comparaçao e explicação do processo de classificação do candidato
  3.Processa as informações com estrutura condicional
  5.Retorna a classificação,juntamente com dados e métricas do usuário.
 */

import java.util.Scanner;

public class Main {

    /*
    =========================================================
    1°PARTE: CONSTANTES
    =========================================================
     */

    //Nível Especialista:
    private static final int ESPECIALISTA_EXPERIENCIA = 10;
    private static final int ESPECIALISTA_PROJETOS = 20;
    private static final double ESPECIALISTA_AVALIACAO = 9.5;

    //Nível Senior:
    private static final int SENIOR_EXPERIENCIA = 7;
    private static final int SENIOR_PROJETOS = 15;
    private static final double SENIOR_AVALIACAO = 7.5;

    //Nível Pleno:
    private static final int PLENO_EXPERIENCIA = 4;
    private static final int PLENO_PROJETOS = 10;
    private static final double PLENO_AVALIACAO = 5.5;



    /*
    =============================================================
    2°PARTE: FLUXO PRINCIPAL (Main)
    =============================================================
     */
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);


     System.out.println("==============================================================");
     System.out.println("          SISTEMA DE CLASSIFICAÇÃO DE DESENVOLVEDORES         ");
     System.out.println("==============================================================");



     //lEGENDA DE CLASSIFICAÇÃO
      exibirLegendaClassificacao();


      //iNPUTS DE MÉTRICAS
     System.out.println("_____ Insira os Dados do candidato _____");
     System.out.println("1. Nome do candidato: ");
     String nome = input.next();
     System.out.println("2.Idade do candidato: ");
     int idade = input.nextInt();
     System.out.println("3.Anos de Experiência do candidato: ");
     int anosExperiencia = input.nextInt();
     System.out.println("4. Total de Projetos do candidato:   ");
     int totalProjetos = input.nextInt();
     System.out.println("5. Média de Avaliações do candidato:   ");
     double mediaAvaliacao = input.nextDouble();

     input.close();

     String nivel = classificarDesenvolvedor(anosExperiencia, totalProjetos, mediaAvaliacao);


        System.out.println("\n================================================");
        System.out.println("RESULTADO DA AVALIAÇÃO");
        System.out.println("================================================");
        System.out.printf("- Nome do Candidato: %s\n", nome);
        System.out.printf("- Idade do Candidato: %d Anos\n", idade);
        System.out.printf("- Anos de Experiência Fornecidos: %d Anos\n", anosExperiencia);
        System.out.printf("- Projetos Concluídos Fornecidos: %d Projetos\n", totalProjetos);
        System.out.printf("- Méida de Avaliação Fornecidos: %.2f\n", mediaAvaliacao);
        System.out.printf("- Classificação do Candidato: %s\n", nivel);
        System.out.println("================================================");
    }


    /*
     ==================================================================
     3°PARTE: ESTRUTURA CONDICIONAL DE AVALIAÇÃO (LÓGICA)
     ==================================================================
     */
    public static String classificarDesenvolvedor(int anosExperiencia, int totalProjetos, double mediaAvaliacao) {


        if (anosExperiencia >= ESPECIALISTA_EXPERIENCIA &&
            totalProjetos   >= ESPECIALISTA_PROJETOS &&
            mediaAvaliacao >= ESPECIALISTA_AVALIACAO){

            return "Especialista";

        }
        else if(anosExperiencia >= SENIOR_EXPERIENCIA &&
                totalProjetos   >= SENIOR_PROJETOS &&
                mediaAvaliacao >= SENIOR_AVALIACAO) {
            return "Sênior";
        }
        else if (anosExperiencia >= PLENO_EXPERIENCIA &&
                totalProjetos   >= PLENO_PROJETOS &&
                mediaAvaliacao >= PLENO_AVALIACAO) {

                return "Pleno";
        }
        else{

                return "Júnior";
        }

    }









    /*
    =================================================================
    4°PARTE: TABELA DE CLASSIFICAÇÃO
    =================================================================
     */

    public static void exibirLegendaClassificacao() {

        System.out.println("==============================================================");
        System.out.println("                CRITÉRIOS DE CLASSIFICAÇÃO                                              ");
        System.out.println("==============================================================");

        //Formatação tabular e alinhamento profissional
        System.out.printf("| %-12s | %-15s | %-12s | %-12s |\n",
                "Nível", "Experiência (Anos)", "Projetos(Concluídos)", "Avaliação (Média)");
        System.out.println("|--------------|-----------------|--------------|--------------|");

        //Especialista
        System.out.printf("| %-12s | %-15s | %-12s | %-12s |\n",
                "Especialista",
                ">=" + ESPECIALISTA_EXPERIENCIA,
                ">=" + ESPECIALISTA_PROJETOS,
                ">=" + ESPECIALISTA_AVALIACAO);

        // Sênior
        System.out.printf("| %-12s | %-15s | %-12s | %-12s |\n",
                "Sênior",
                ">=" + SENIOR_EXPERIENCIA,
                ">=" + SENIOR_PROJETOS,
                ">=" + SENIOR_AVALIACAO);

        // Pleno
        System.out.printf("| %-12s | %-15s | %-12s | %-12s |\n",
                "Pleno",
                ">=" + PLENO_EXPERIENCIA,
                ">=" + PLENO_PROJETOS,
                ">=" + PLENO_AVALIACAO);

        // Júnior
        System.out.printf("| %-12s | %-15s | %-12s | %-12s |\n",
                "Júnior",
                "<" + PLENO_EXPERIENCIA,
                "<" + PLENO_PROJETOS,
                "<" + PLENO_AVALIACAO);
        System.out.println("----------------------------------------------------\n");

    }











}

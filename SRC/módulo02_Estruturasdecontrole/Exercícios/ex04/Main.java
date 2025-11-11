package módulo02_Estruturasdecontrole.Exercícios.ex04;


import java.util.Scanner;

/**
 ========================================================
 Execício 04:
 Você está testando um sistema bancário que realiza cadastros de clientes.
 Como parte do time de QA,
 precisa criar uma rotina que verifique se os campos obrigatórios foram preenchidos.

 !Entrada: Três valores do tipo String, representando: nome, cpf e email.
 Os campos podem ser vazios ("").

 !Saída: Se algum campo estiver vazio, deve retornar:
 Cadastro incompleto

 Se todos estiverem preenchidos, deve retornar:
 Cadastro validado com sucesso
 ========================================================
 */


public class Main {


    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=====================================================");
        System.out.println("                  Cadastro Cliente                   ");
        System.out.println("=====================================================");

        System.out.println("Digite o seu Nome: ");
        String nome = SC.nextLine().trim();
        System.out.println("Digite o seu CPF: ");
        String cpf = SC.nextLine().trim();
        System.out.println("Digite o seu email: ");
        String email = SC.nextLine().trim();


        boolean cadastroCompleto = nome.length() > 0 && cpf.length() > 0 && email.length() > 0;


        if (cadastroCompleto) {
            imprimirResultadoCadastro(nome, cpf, email, true);
        } else {
            String nomeParaImpressao = nome.length() > 0 ? nome : "Campo vazio";
            String cpfParaImpressao = cpf.length() > 0 ? cpf : "Campo vazio";
            String emailParaImpressao = email.length() > 0 ? email : "Campo vazio";

            imprimirResultadoCadastro(nomeParaImpressao, cpfParaImpressao, emailParaImpressao, false);
        }

        SC.close();
    }


    private static void imprimirResultadoCadastro(String nome, String cpf, String email, boolean validado) {

        System.out.println("\n+----------------------+------------------+------------------------------+");
        System.out.printf("| %-20s | %-16s | %-20s |%n", "NOME COMPLETO", "CPF", "E-MAIL");
        System.out.println("+----------------------+------------------+------------------------------+");
        System.out.printf("| %-20s | %-16s | %-20s |%n", nome, cpf, email);
        System.out.println("+----------------------+------------------+------------------------------+");

        System.out.println("\n*** STATUS DO CADASTRO ***");
        if (validado) {
            System.out.println(" Cadastro validado com sucesso");
        } else {
            System.out.println(" Cadastro incompleto");
        }
    }
}
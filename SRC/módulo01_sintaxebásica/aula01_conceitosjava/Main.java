package módulo01_sintaxebásica.aula01_conceitosjava;

import java.util.Scanner;



    public class Main {

        private final static String WELCOME_MESSAGE = "Digite seu nome: ";


        public static void main(String[] args) {
        /*
         Comentário java
        */
        //ou var scanner = new Scanner(System.in);
        // no entanto este metodo var não pertmite:
        // reatribução de variáel já nomeada.
        // declaração noType de variável
        Scanner scanner =  new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String nome = scanner.next();
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf(" Olá %s a sua idade é %s \n", nome, idade);
    }
}

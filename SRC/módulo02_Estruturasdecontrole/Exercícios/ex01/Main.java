package módulo02_Estruturasdecontrole.Exercícios.ex01;


import java.util.Scanner;

/**
 ========================================================
 Execício 01:
 Escreva um código onde o usuário entra com um número e
 seja gerada a tabuada de 1 até 10 desse número;
 ========================================================
 */

public class Main {

    private static final Scanner SCANNER = (new Scanner (System.in));


    public static void main(String[] args) {



        System.out.println("=======================================");
        System.out.println("                TABUADA                ");
        System.out.println("=======================================");


        System.out.println("Digite um número que deseja ver a sua tabuada: ");
        int numeroTabuada = SCANNER.nextInt();
        int i = 0;

        System.out.println("=======================================");
        System.out.println("                RESULTADO              ");
        System.out.println("=======================================");
        for(i = 0; i <= 10; i++){
            int res = (numeroTabuada * i);
            System.out.printf("| %d X %d = %d |\n",numeroTabuada, i, res);
        }




    }


}

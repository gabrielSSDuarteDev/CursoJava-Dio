package módulo02_Estruturasdecontrole.Exercícios.ex03;


import java.util.Scanner;

import static java.lang.Integer.valueOf;

/**
 ========================================================
 Execício 03:
 Escreva um código que imprima a sequencia entre com um primeiro número,
 um segundo número maior que o primeiro.
 escolhe entre a opção par e impar,
 com isso o código deve informar todos os números pares ou ímpares
 (de acordo com a seleção inicial)
 no intervalo de números informados, incluindo os números informados ;
 ========================================================
 */


public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("================================================= ");
        System.out.println("                 Contador Par/Imp                 ");
        System.out.println("================================================= ");


        System.out.println("___________________INSTRUÇÕES______________________");
        System.out.println("Digite o ínicio do contador: ");
        int ini = sc.nextInt();
        System.out.println("Digite o fim do contador: ");
        int fim = sc.nextInt();
        System.out.println("Você quer ver os números pares ou ímpares? (Digite: Par ou Impar): ");
        String escolha = sc.next();


        if (escolha.equals("Par") || escolha.equals("par") || escolha.equals("pares")) {
            for (int i = ini; i <= fim; i++) {
                if (i % 2 == 0) {
                    System.out.printf("%2d ", i);
                }
            }
        } else if (escolha.equals("Impar") || escolha.equals("impar") || escolha.equals("impares")) {
            for (int i = ini; i <= fim; i++) {
                if (i % 2 != 0) {
                    System.out.printf("%2d ", i);
                }

            }
        }
        else{
            System.out.println("Valor digitado inválido!Por favor,digite par ou impar!");
        }


    }

}
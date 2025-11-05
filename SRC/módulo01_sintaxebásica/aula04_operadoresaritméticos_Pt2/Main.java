package módulo01_sintaxebásica.aula04_operadoresaritméticos_Pt2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        double resultado = 0;
        double resultado2 = 0;
        boolean seguirOp = true;
        char opSimbolo = ' ';

        System.out.println("_______ Calculadora Simples __________");

        System.out.println("Digite o primeiro numero: ");
        var num1 = sc.nextFloat();

        System.out.println("Digite o segundo numero: ");
        var num2 = sc.nextFloat();

        System.out.println("\nDigite a operação desejada: ");
        System.out.println(" 1.Soma = '+' ");
        System.out.println(" 2.Subtração = '-'");
        System.out.println(" 3.Multiplicação = '*'");
        System.out.println(" 4.Divisão = '/'");
        System.out.println(" 5.Potência = '^'");
        System.out.println(" 6.Raiz Quadrada = 'R'");
        System.out.print(" Operação Desejada: ");


        var op = sc.next().charAt(0);


        switch (op) {
            case '+':
            case '1':
                resultado = num1 + num2;

                break;
            case '-':
            case '2':
                resultado = num1 - num2;

                break;
            case '*':
            case '3':
                resultado = num1 * num2;
                break;
            case  '/':
            case '4':
                if(num2 != 0) {
                    resultado = (double) num1 / num2;
                }else {
                    System.out.println("ERRO: Divisão por zero não é permitida!");
                    seguirOp = false;
                }
                break;

            case '^':
            case '5':
                resultado = (double) Math.pow(num1, num2);
                break;

            case 'R':
            case '6':
                if(num2 != 0) {
                    resultado = (double) Math.sqrt(num1);
                    resultado2 = (double) Math.sqrt(num2);
                }
                else {
                    System.out.println("ERRO: Raiz quadrada de número negativo não é suportada.");
                    seguirOp = false;
                }

               break;

                default:
                    System.out.println("Erro! Operação inválida. Use +, -, * ou /.");
                    seguirOp = false;

        }

        if (seguirOp) {
            if (op == 'R' || op == '6') {
                System.out.printf("Resultado do N°1: %c(%.2f) = %.2f%n",opSimbolo,num1,resultado);
                System.out.printf("Resultado do N°2: %c(%.2f) = %.2f%n",opSimbolo,num2,resultado2);
            }
            else{
                System.out.printf("Resultado: %.2f %c %.2f = %.2f%n", num1, opSimbolo, num2, resultado);
            }

        }

        sc.close();



    }


}

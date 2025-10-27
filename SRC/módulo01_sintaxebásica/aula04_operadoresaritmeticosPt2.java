package módulo01_sintaxebásica;

import java.util.Scanner;

public class aula04_operadoresaritmeticosPt2 {


    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        double resultado = 0;
        boolean seguirOp = true;

        System.out.println("_______ Calculadora Simples __________");

        System.out.println("Digite o primeiro numero: ");
        var num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        var num2 = sc.nextInt();

        System.out.println("Digite a operação desejada: (+, - , *, /, ^, R): ");
        var op = sc.next().charAt(0);


        switch (op) {
            case '+':
                System.out.println(num1 + num2);

                break;
            case '-':
                System.out.println(num1 - num2);

                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case  '/':
                if(num2 != 0) {
                    resultado = (double) num1 / num2;
                }else {
                    System.out.println("ERRO: Divisão por zero não é permitida!");
                    seguirOp = false;
                }
                break;

            case '^':
                resultado = (double) Math.pow(num1, num2);
                break;

            case 'R':
                resultado = (double) Math.sqrt(num1);
                System.out.println(num2);

                default:
                    System.out.println("Erro! Operação inválida. Use +, -, * ou /.");
                    seguirOp = false;

        }

        if (seguirOp) {
            System.out.printf("Resultado: %d %c %d = %.2f%n", num1, op, num2, resultado);
        }

        sc.close();



    }


}

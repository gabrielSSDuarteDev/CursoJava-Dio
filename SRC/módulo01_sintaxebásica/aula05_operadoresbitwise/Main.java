package módulo01_sintaxebásica.aula05_operadoresbitwise;

import java.util.Scanner;

import static java.lang.Integer.toBinaryString;

public class Main {


    private static String toBinaryString(int n){
        return String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res = 0;
        int resNum1 = 0;
        int resNum2 = 0;
        int num1 = 0;
        int num2 = 0;
        boolean seguirOp = true;
        String simboloOp = "";


        System.out.println("________Calculadora Bitwise Operators_________");

        System.out.println("Escolha a operação desejada (Número ou Símbolo da operção): ");
        System.out.println("1. AND = '&'");
        System.out.println("2. OR = '|'");
        System.out.println("3. XOR = '^'");
        System.out.println("4. NOT = '~'");
        System.out.println("5. SHIFT LEFT = '<'");
        System.out.println("6. SHIFT RIGHT com sinal = '>'");
        System.out.println("7. SHIFT RIGHT sem sinal = '!'");
        System.out.print("Operação Desejada: ");
        var opBitwise = sc.next().charAt(0);

        System.out.println("\n-------------------------------------------------------\n");

        System.out.print("Digite o 1° número para operação (inteiro): ");
        num1 = sc.nextInt();
        System.out.print("Digite o 2° número para operação (inteiro/deslocamento de bits): ");
        num2 = sc.nextInt();


        System.out.print("\n_________Binário das Entradas_________\n");
        System.out.printf("N°1 (%d): %s\n", num1, toBinaryString(num1));
        System.out.printf("N°2 (%d): %s\n", num2, toBinaryString(num2));
        System.out.println("\n-------------------------------------------------------\n");

        switch (opBitwise) {

            case '&':
            case '1':
                res = num1 & num2;
                simboloOp = "&";
                break;

            case '|':
            case '2':
                res = num1 | num2;
                simboloOp = "|";
                break;

            case '^':
            case '3':
                res = num1 ^ num2;
                simboloOp = "^";
                break;

            case '~':
            case '4':
                resNum1 = ~num1;
                resNum2 = ~num2;
               simboloOp = "~";
               break;

            case '<':
            case '5':
                res = num1 << num2;
                simboloOp = "<";
                break;

            case '>':
            case '6':
                res = num1 >> num2;
                simboloOp = ">";
                break;

            case '!':
            case '7':
                res = num1 >>> num2;
                simboloOp = "!";
                break;

            default:
                System.out.println("Erro! Operação Bitwise inválida");
                seguirOp = false;
                break;
        }


        if (seguirOp) {
            System.out.println("\n-----Resultado BitWise-----");

        if(simboloOp.equals("~")){
            System.out.printf("Resultado: %s%d = %d%n", simboloOp, num1, resNum1);
            System.out.printf("Resultado em Binário: %s%n",toBinaryString(resNum1));
            System.out.printf("Resultado em Entradas: %s%n",toBinaryString(resNum2));

        }
        else if (simboloOp.equals(">") || simboloOp.equals("<") || simboloOp.equals("!")) {
            System.out.printf("Resultado: %d %s %d = %d%n" ,num1, simboloOp ,num2, res);
            System.out.printf("Resultado em Entradas: %s%n",toBinaryString(res));
        }
        else{
            System.out.printf("Resultado: %d %s %d = %d%n",num1, simboloOp,num2, res);
            System.out.printf("Resultado em Entradas: %s%n",toBinaryString(res));
            }
        }
            sc.close();
        }
    }

package módulo01_sintaxebásica.aula06_exerciciosjava.exercicio_04;

import java.time.Year;
import java.util.Scanner;


/*Exercício 04 -
   Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
*/



public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano = Year.now().getValue();
        int diff = 0;

        System.out.println("________Questionário de Idade_________ ");

        System.out.println("Olá,pessoa 1. Qual o seu nome? \n");
        String nome1 = sc.next();
        System.out.println("E qual o seu ano de nascimento? \n");
        int anoNascP1 = sc.nextInt();
        int idadeP1 = ano - anoNascP1;


        System.out.println("Olá,pessoa 2. Qual o seu nome? \n");
        String nome2 = sc.next();
        System.out.println("E qual o seu ano de nascimento? \n");
        int anoNascP2 = sc.nextInt();
        int idadeP2 = ano - anoNascP2;


        System.out.printf("Você tem %d anos pessoa 1\n", idadeP1);
        System.out.printf("Você tem %d anos pessoa 2\n", idadeP2);

        if (idadeP1 > idadeP2) {
            diff = idadeP1 - idadeP2;
        }
        else {
             diff = idadeP2 - idadeP1;
        }

        System.out.printf("A Diferença entre idades é: %d",diff);





    }




}

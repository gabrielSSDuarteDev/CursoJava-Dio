package módulo01_sintaxebásica.aula06_exerciciosjava.exercicio_01;

import java.util.Scanner;
import java.time.Year;

/*Exercício 01 -
    Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
    "Olá 'Fulano' você tem 'X' anos"
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá,qual o seu nome? ");
        String nome = sc.nextLine();

        System.out.println("E qual o seu ano de nascimento? ");
        int anoNasc = sc.nextInt();
        int ano = Year.now().getValue();
        int idade = ano - anoNasc;

        System.out.printf("Olá %s você tem %d", nome, idade);



    }

}

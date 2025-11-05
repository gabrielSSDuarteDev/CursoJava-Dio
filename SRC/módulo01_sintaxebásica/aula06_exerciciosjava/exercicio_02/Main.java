package módulo01_sintaxebásica.aula06_exerciciosjava.exercicio_02;


/*Exercício 02 -
   Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
    fórmula: área=lado X lado
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Calculo de Area: Quadrado --------");

        System.out.println("Digite o tamnho do lado do quadrado:");
        double lado = sc.nextDouble();
        double area = lado * lado;

        System.out.printf("5A área do quadrado é igual a: %.2fcm² ", area);
    }
}

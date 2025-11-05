package módulo01_sintaxebásica.aula06_exerciciosjava.exercicio_03;


/*Exercício 03 -
    Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
    fórmula: área=base X altura
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Calculo de Area: Retangulo --------");

        System.out.println("Digite o tamnho da base do retangulo:");
        double base = sc.nextDouble();

        System.out.println("Digite o tamnho da altura do retangulo:");
        double altura= sc.nextDouble();

        double area = base * altura;

        System.out.printf("A área do retangulo é igual a: %.2fcm² ", area);
    }
}

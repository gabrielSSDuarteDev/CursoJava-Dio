package módulo02_Estruturasdecontrole.Exercícios.ex02;


import java.util.Scanner;

/**
 ========================================================
 Execício 02:
 1.Escreva um código onde o usuário entra com sua altura e peso,
 2.seja feito o calculo do seu IMC(IMC = peso/(altura * altura))
 3.seja exibida a mensagem de acordo com o resultado:
 Se for menor ou igual a 18,5 "Abaixo do peso";
 se for entre 18,6 e 24,9 "Peso ideal";
 Se for entre 25,0 e 29,9 "Levemente acima do peso";
 Se for entre 30,0 e 34,9 "Obesidade Grau I";
 Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
 Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 ========================================================
 */





public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("             Cálculo de IMC            ");
        System.out.println("=======================================");

        System.out.println("Para descobrir o seu IMC digite: " );
        System.out.print("1. Sua Altura(m): ");
        float altura = sc.nextFloat();
        System.out.print("2. Sua Peso: ");
        float peso = sc.nextFloat();

        System.out.println("=======================================");
        System.out.println("               RESULTADO               ");
        System.out.println("=======================================");

        float IMC = peso /  (altura * altura);

        if(IMC <= 18.5){
            System.out.println("Você está abaixo do peso!");
            System.out.printf("Seu IMC: %.2f",IMC);
        }
        else if(IMC >= 18.6 &&  IMC <= 24.9){
            System.out.println("Você está no Peso ideal!");
            System.out.printf("Seu IMC: %.2f",IMC);
        }
        else if(IMC >= 25 &&  IMC <= 29.9){
            System.out.println("Você está levemente acima do peso");
            System.out.printf("Seu IMC: %.2f",IMC);
        }
        else if(IMC >= 30 &&  IMC <= 39.9){
            System.out.println("Você está com Obesidade Grau I");
            System.out.printf("Seu IMC: %.2f",IMC);
        }
        else if(IMC >= 40 &&  IMC <= 49.9){
            System.out.println("Você está com Obesidade Grau II (Severa)");
            System.out.printf("Seu IMC: %.2f",IMC);
        }
        else if(  IMC < 49.9){
            System.out.println("Você está com Obesidade III (Mórbida)");
            System.out.printf("Seu IMC: %.2f",IMC);
        }




    }


}

package módulo01_sintaxebásica.aula03_operadoreskavaPt1;

import java.util.Scanner;

public class Main {

    //Verificador de Soma
        public static void main2(String[] args) {
           var scanner = new Scanner(System.in);
           System.out.print("Quanto é 5 + 5: \t");
           var resultado = scanner.nextInt();
           var isLeft = resultado == 5;
           System.out.printf("O resultado é 10.\n", isLeft);
           System.out.printf("A sua resposta foi: %d\n", resultado);

           if (isLeft == true) {
               System.out.println("Muito Bem! Continue assim");
           }else {
               System.out.println("Você errou! Tente novamente");
           }
        }

        //verificador de idade
        public static void main3(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Quantos anos você tem: ");
            var age = sc.nextInt();
            System.out.printf("Você tem %s anos! \n" ,age);
             if(age >= 18){
                 System.out.println("Você está apto a dirigir");
             }
             else{
                 System.out.println("Você não está apto a dirigir");
             }
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);



        }






}

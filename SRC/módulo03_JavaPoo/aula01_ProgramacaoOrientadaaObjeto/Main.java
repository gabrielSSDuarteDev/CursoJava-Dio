package módulo03_JavaPoo.aula01_ProgramacaoOrientadaaObjeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        System.out.println("CANETA 1: ");
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.carga = 10;
        c1.modelo = "Bic";
        c1.tampar();
        c1.status();
        c1.escrever();

        System.out.println("==================================================");
        System.out.println("CANETA 2: ");
        Caneta c2 = new Caneta();
        c2.cor = "Verde";
        c2.ponta = 0.7f;
        c2.tampada = true;
        c2.carga = 10;
        c2.modelo = "Banco";
        c2.destampar();
        c2.status();
        c2.escrever();






    }
}
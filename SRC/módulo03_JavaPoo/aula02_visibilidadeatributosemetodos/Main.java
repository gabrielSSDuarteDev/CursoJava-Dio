package módulo03_JavaPoo.aula02_visibilidadeatributosemetodos;

public class Main {

    public static void main(String[] args) {
        Caneta02 c1 = new Caneta02();
        c1.modelo = "A";
        c1.cor = "Azul";    
        c1.ponta = 0.9f;
        c1.carga = 1;
        c1.tampar();
        c1.status();
        c1.escrever();


        Caneta02 c2 = new Caneta02();
        c2.modelo = "B";
        c2.cor = "Verde";
        c2.carga = 1;
        c2.destampar();
        c2.status();
        c2.escrever();










    }
}
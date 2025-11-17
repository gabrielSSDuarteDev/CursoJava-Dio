package módulo03_JavaPoo.aula02_visibilidadeatributosemetodos;

public class Caneta02 {
   public String modelo;
   public String cor;
   public Float ponta;
   private boolean tampada;
   protected int carga;



    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("A caneta está Tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
    }

    public boolean escrever() {
        if (this.tampada == true) {
            System.out.println("[ERRO] A caneta está tampada");
        } else {
            System.out.println("Escrevendo...");
        }
       return false;
    }


    public  void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}

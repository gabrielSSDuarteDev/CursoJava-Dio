package módulo03_JavaPoo.aula03_metodosEspeciais;

public class Caneta03 {

      public String modelo;
      public String cor;
      private Float ponta;
      public boolean tampada;


    public Caneta03(String modelo, String cor, Float ponta) {
        setModelo(modelo);
        setCor(cor);
        setPonta(ponta);
        tampar();
    }


    public void status() {
        System.out.printf("Dados de caneta\n" +
                        "Modelo: %s\n" +
                        "Cor: %s\n" +
                        "Ponta: %s\n" +
                        "A caneta está tampada? %s" ,
               this.getModelo(), this.getCor(), this.getPonta(), this.getTampada());
    }

    //Getter e Setter +  Metodo - Tampada

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public Boolean getTampada(){
        return this.tampada;
    }

    public void tampar(){
        setTampada(true);
    }
    public void destampar(){
        setTampada(false);
    }













    //getter e setter - Ponta
    public Float getPonta() {
        return ponta;
    }

    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }

    //getter e setter -  Cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    //getter e setter Modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}







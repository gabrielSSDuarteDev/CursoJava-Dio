package módulo03_JavaPoo.aula04_exemplopratico_CONTABANCO;


import java.util.Objects;

public class ContaBanco {

    //atributos contabanco
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("============================================");
        System.out.printf("Conta: %s\n", getNumConta());
        System.out.printf("Tipo: %s\n", getTipo());
        System.out.printf("Dono: %s\n", getDono());
        System.out.printf("Saldo: %s\n", getSaldo());
        System.out.printf("Status: %s\n", getStatus());
    }


    public void abrirConta(String tipo ){
        setTipo(tipo);
        setStatus(true);
        if (tipo == "CC") {
            saldo = 50;
        }else if (tipo == "CP") {
            saldo = 150;
        }
        System.out.printf("Conta aberta de %s com sucesso!",getDono());
    }


    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Conta com Dinheiro! Não foi possível completar o processo");
        } else if (getSaldo() < 0) {
            System.out.println("Débito em Aberto! Não foi possível completar o processo");
        }
        else{
            setStatus(false);
            System.out.println("Conta Fechada com sucesso!");
        }
    }

    public void depositar(float valor){
        if(getStatus()){
            setSaldo(getSaldo() + valor);
            System.out.printf("Deposito realizado na conta de %s com sucesso!",getDono());
        } else {
            System.out.println("Não foi possível completar a transação. Conta fechada!");
        }
    }

    
    public void sacar(float valor){
        if(getStatus() && getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void pagarMensal(){
        var valor = getSaldo();
            if(Objects.equals(getTipo(), "CC")) {
                setSaldo(getSaldo() - 12);
            }
            else if (Objects.equals(getTipo(), "CP")) {
                setSaldo(getSaldo() - 20);
            }
        if(getStatus()){
            if(getSaldo() >= valor){
                setSaldo(saldo - valor);
            }else {
                System.out.println("Saldo insuficiente!");
            }
        }else {
            System.out.println("Conta Fechada!");
        }
        System.out.printf("Mensalidade de %s realizado com sucesso!",getDono());
    }

    public ContaBanco() {
        setSaldo(0.0f);
        setTipo(tipo);
    }


    //metodos getters e setters


     public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

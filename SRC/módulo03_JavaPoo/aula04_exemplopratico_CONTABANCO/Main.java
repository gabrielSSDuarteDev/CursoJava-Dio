package módulo03_JavaPoo.aula04_exemplopratico_CONTABANCO;

public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();

        conta1.setNumConta(1);
        conta1.setTipo("CC");
        conta1.setDono("Gabriel");
        conta1.setSaldo(150.0f);
        conta1.abrirConta("CC ");
        conta1.estadoAtual();
        conta1.depositar(100.0f);
        conta1.sacar(50.0f);
        conta1.pagarMensal();









    }
}

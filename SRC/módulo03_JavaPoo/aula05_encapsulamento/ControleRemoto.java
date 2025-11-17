package módulo03_JavaPoo.aula05_encapsulamento;

public class ControleRemoto implements Controlador {


        ///  Atributos
        private int volume;
        private boolean ligado;
        private boolean tocando;

        /// Metodos especiais

    public ControleRemoto() {
        volume = 0;
        ligado = false;
        tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    //Métodos de Interface ou Abstratos



    @Override
    public void ligar() {
        setLigado(true);

    }

    @Override
    public void desligar() {
        setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.println("------MENU------");
       System.out.printf("Está ligado? %s", isLigado());
       System.out.printf("Está Tocando? %s", isTocando());
       System.out.printf("Volume: %s", getVolume());
        for(int i = 0; i < getVolume(); i++) {
            System.out.println("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu.....");
    }

    @Override
    public void maisVolume() {
        if(isLigado()) {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(isLigado()) {
            setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(isLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigado() && !isTocando()) {
            setTocando(true);

        }

    }

    @Override
    public void pause() {
        if(isLigado() && isTocando()) {
            setTocando(false);
        }

    }










}

package módulo03_JavaPoo.Exercícios.Ex01_petshop;

public class Pet {


    private final String namePet;




    private boolean clean;

    public Pet(String namePet) {
        this.namePet = namePet;
        this.clean = false;
    }

    public String getNamePet() {
        return namePet;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}

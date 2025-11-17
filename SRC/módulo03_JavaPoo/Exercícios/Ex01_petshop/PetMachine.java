package módulo03_JavaPoo.Exercícios.Ex01_petshop;

public class PetMachine {
    private boolean clean;
    private int shampoo;
    private int water;
    private Pet pet = null;



    public void takeShowerPet() {
        if(this.pet == null) {
            System.out.println("Não há pets na Máquina de banho. Por favor,coloque o Pet para o incío do Banho");
            return;
        }


            this.water -= 10;
            this.shampoo -= 2;
            pet.setClean(true);
            System.out.printf("O Pet: %s já esta limpo.",pet.getNamePet());

}


        public void addWater() {
            if(water == 30) {
                System.out.println("A capacidade de água da máquina está no máximo");
                return;
            }
            water += 2;
        }


    public void addShampoo() {
        if(shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo += 2;
    }
    public int getWater() {
        return water;
    }


    public  int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }


    public void setPet(Pet pet){
        if(!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la");
            return;
        }


        if (hasPet()) {
            System.out.printf("O Pet %s está na máquina de banho neste momento.",pet.getNamePet());
            return;

        }

        this.pet = pet;

    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O Pet %s está limpo!");
        this.pet = null;
        
    }

    public void washMachine(){
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = false;
        System.out.println("A máquina está Limpa");
    }

}

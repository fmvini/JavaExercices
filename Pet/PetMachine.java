package exJava03;

public class PetMachine {
    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;


    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        if (water < 10) {
            System.out.println("Água insuficiente para o banho.");
            return;
        }

        if (shampoo < 2) {
            System.out.println("Shampoo insuficiente para o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        this.pet.setClean(true);

        System.out.println("O pet " + this.pet.getName() + " está limpo!");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água da máquina está no máximo!");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo!");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la");
            return;
        }
        if(hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na maquina nesse momento.");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo.");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina está limpa.");
    }

}

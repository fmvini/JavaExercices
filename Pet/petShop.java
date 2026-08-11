package exJava03;

import exJava03.Pet;
import exJava03.PetMachine;

import java.util.Scanner;

public class petShop {

    private static final Scanner scanner = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da maquina");
            System.out.println("5 - Verificar shampoo da maquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }

        } while (true);
    }

    private static void setWater(){
        System.out.println("Adicionando água à máquina");
        petMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Adicionando shampoo à máquina");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com " + amount + " litros de água");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " litros de shampoo");
    }

    private static boolean checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina");
        return hasPet;
    }

    public static void setPetInPetMachine() {
        String name = "";

        while (name.isEmpty()) {
            System.out.println("Digite o nome do pet:");
            name = scanner.next();
        }

        Pet pet = new Pet(name);
        petMachine.setPet(pet);

        System.out.println("O pet " + pet.getName() + " foi colocado na máquina!");
    }
}
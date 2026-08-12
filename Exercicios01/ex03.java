import java.util.Scanner;

public class ex03{
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Digite um numero para saber se ele é par ou impar: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("O numero é par!");
        }
        else{
            System.out.println("O numero é impar!");
        }
    }
}
import  java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int fat = 1;

        for (int i = num; i > 0; i--) {
            fat = i * fat;
        }

        System.out.println("O resultado de " + num + " fatorial é: " + fat);
    }
}
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ano = 2026;

        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Em que ano voce nasceu?");
        int nasc = scanner.nextInt();

        int idade = ano - nasc;

        System.out.println("Ola " + nome + ", voce tem " + idade + " anos!");

        scanner.close();
    }
}
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        int num2;

        do {
            System.out.print("Digite outro numero: ");
            num2 = scanner.nextInt();
        } while (num2 % num != 0);

        System.out.println("O resto da divisao de " + num2 + " por " + num + " é 0!");
    }
}
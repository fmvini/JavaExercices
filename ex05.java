import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ver sua tabuada: ");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

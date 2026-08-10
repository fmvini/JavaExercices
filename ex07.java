import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite 1 para IMPAR e 2 para PAR: ");
        int choice = scanner.nextInt();

        if (num2 > num1){
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0 && choice == 2){
                    System.out.print(i + " ");
                }
                else if (i % 2 != 0 && choice == 1){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
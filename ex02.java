import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanho do lado do quadrado: ");
        float lado = scanner.nextFloat();
        float area = lado * lado;
        System.out.println("A area do seu quadrado é: " + area);
    }
}

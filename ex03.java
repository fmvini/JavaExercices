import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do retangulo: ");
        float base = scanner.nextFloat();
        System.out.println("Digite o valor da altura do retangulo: ");
        float altura = scanner.nextFloat();

        float area = base * altura;
        System.out.println("O valor da area é: " + area);
    }
}
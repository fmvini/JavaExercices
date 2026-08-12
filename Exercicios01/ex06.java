import java.util.Scanner;

public class ex06  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double tempC = input.nextInt();
        double tempF = (tempC * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit: " + tempF);
    }
}
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        var imc = peso/(altura * altura);

        if  (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc > 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("Levemente acima do peso");
        }
        else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau 1");
        }
        else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Grau 2 (Severa)");
        }
        else{
            System.out.println("Obesidade Grau 3 (Morbida)");
        }
    }
}

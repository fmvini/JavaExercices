import java.util.Scanner;

public class ex04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres numeros para ver o maior: ");
        int maior = 0;
        for (int i = 0; i < 3; i++){
            int num = 0;
            num = sc.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior numero é: " + maior);
    }
}
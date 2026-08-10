import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String primeiraPessoa = scanner.nextLine();

        System.out.println("Digite a idade da primeira pessoa: ");
        int idadePessoa1 = scanner.nextInt();

        scanner.nextLine(); // limpa o Enter pendente

        System.out.println("Digite o nome da segunda pessoa: ");
        String segundaPessoa = scanner.nextLine();

        System.out.println("Digite a idade da segunda pessoa: ");
        int idadePessoa2 = scanner.nextInt();

        int diferenca;

        if (idadePessoa1 > idadePessoa2) {
            diferenca = idadePessoa1 - idadePessoa2;
        } else if (idadePessoa1 < idadePessoa2) {
            diferenca = idadePessoa2 - idadePessoa1;
        } else {
            diferenca = 0;
        }

        System.out.println("A diferença de idade entre "
                + primeiraPessoa + " e "
                + segundaPessoa + " é de "
                + diferenca + " anos.");
    }
}
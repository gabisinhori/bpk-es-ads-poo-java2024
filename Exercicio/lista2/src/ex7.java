import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        ex7 ex7 = new ex7();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int num2 = scanner.nextInt();

        int soma = ex7.soma(num1, num2);

        System.out.println(soma);

    }

    public int soma(int num1, int num2){

        int soma = num1 + num2;

        return soma;

    }
}
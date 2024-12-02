import java.util.Scanner;

public class ex15 {

    public static int fatorialIterativo(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int fatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorialRecursivo(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        int resultadoIterativo = fatorialIterativo(numero);
        System.out.println("Fatorial de " + numero + " (iterativo): " + resultadoIterativo);

        int resultadoRecursivo = fatorialRecursivo(numero);
        System.out.println("Fatorial de " + numero + " (recursivo): " + resultadoRecursivo);
    }
}
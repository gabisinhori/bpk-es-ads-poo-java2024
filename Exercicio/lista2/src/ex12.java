import java.util.Arrays;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um numero:");
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("Os números em ordem crescente são:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
    }
}
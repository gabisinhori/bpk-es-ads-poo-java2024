import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = scanner.nextInt();

        if(num % 2 == 0)
        {
            System.out.printf("O numero %d é par", num);
        }else{
            System.out.printf("O numero %d é impar", num);
        }
    }
}
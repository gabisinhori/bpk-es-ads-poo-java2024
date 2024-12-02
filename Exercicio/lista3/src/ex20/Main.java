package ex20;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Softpar", "17.785.128/0001-49", 100);
        empresa.contratarFuncionario();
        empresa.demitirFuncionario();

        System.out.println();
    }
}
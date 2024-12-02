package ex12;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Bastardos Inglórios", "Quentin Tarantino", 120);
        filme.iniciar();
        filme.parar();

        System.out.println();
    }
}
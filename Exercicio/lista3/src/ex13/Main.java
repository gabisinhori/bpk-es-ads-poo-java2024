package ex13;

public class Main {
    public static void main(String[] args) {
        Time time = new Time("Corinthians", "Ramón Díaz", 11);
        time.adicionarJogador("Igor Coronado");
        time.adicionarJogador("Yuri Alberto");
        time.removerJogador("Igor Coronado");

        System.out.println();
    }
}
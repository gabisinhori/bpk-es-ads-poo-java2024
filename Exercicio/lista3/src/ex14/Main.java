package ex14;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Grand Theft Auto V", "Ação e Aventura", 107.90);
        jogo.iniciar();
        jogo.pausar();

        System.out.println();
    }
}
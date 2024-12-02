package ex17;

public class Main {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 818);
        livro.abrir();
        livro.fechar();

        System.out.println();
    }
}
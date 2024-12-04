package ex1;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0;
    }

    public void abrir() {
        System.out.println("O livro '" + titulo + "' está aberto.");
    }

    public void lerPagina() {
        if (paginaAtual < numeroDePaginas) {
            System.out.println("Lendo a página " + (paginaAtual + 1) + " do livro '" + titulo + "'.");
            paginaAtual++;
        } else {
            System.out.println("Você já leu todas as páginas do livro '" + titulo + "'.");
        }
    }
}
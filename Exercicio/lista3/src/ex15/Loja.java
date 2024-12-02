package ex15;

public class Loja {
    public String nome;
    public String endereco;
    public String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrir() {
        System.out.println("A loja " + nome + " está aberta.");
    }

    public void fechar() {
        System.out.println("A loja " + nome + " está fechada.");
    }
}
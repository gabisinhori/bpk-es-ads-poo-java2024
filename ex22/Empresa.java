package ex22;

public class Empresa {
    private String nome;
    private String cnpj;
    private int numeroFuncionarios;

    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar(int quantidade) {
        this.numeroFuncionarios += quantidade;
        System.out.println(quantidade + " funcionário(s) contratado(s). Total de funcionários: " + numeroFuncionarios);
    }

    public void demitir(int quantidade) {
        if (quantidade > numeroFuncionarios) {
            System.out.println("Número de funcionários a serem demitidos é maior do que o total atual.");
        } else {
            this.numeroFuncionarios -= quantidade;
            System.out.println(quantidade + " funcionário(s) demitido(s). Total de funcionários: " + numeroFuncionarios);
        }
    }
}
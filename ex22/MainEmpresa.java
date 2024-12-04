package ex22;

public class MainEmpresa {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("Tech Solutions", "12.345.678/0001-99", 50);

        minhaEmpresa.contratar(10);
        minhaEmpresa.demitir(5);
        minhaEmpresa.demitir(60);  // Tentativa de demitir mais funcionários do que o disponível
    }
}
package pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Breno",16,1.83);
        Pessoa pessoa2 = new Pessoa("João",15,1.80);

        pessoa1.mostrarDados();

        pessoa2.mostrarDados();

        pessoa1.fazerAniversario();
        pessoa1.mostrarDados();
    }
}

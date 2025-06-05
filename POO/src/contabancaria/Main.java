package contabancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("1231-77", "Israel");

        contaBancaria.depositar(500);
        contaBancaria.saque(200);
        contaBancaria.saque(400);
        contaBancaria.mostrarSaldo();
    }
}

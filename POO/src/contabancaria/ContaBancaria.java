package contabancaria;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void saque(double valor){
        if (saldo <= valor) {
            System.out.printf("Saldo insuficiente para saque de R$ %.2f!%n",valor);
        }else{
            saldo-=valor;
            System.out.printf("Saque de R$ %.2f realizado.%n",valor);
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado.%n",valor);
    }

    public void mostrarSaldo() {
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n", titular, saldo);
    }
}

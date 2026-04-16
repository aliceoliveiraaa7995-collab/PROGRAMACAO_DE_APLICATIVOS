public class Conta {
    double saldo;

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque realizado: " + valor);
    }
}

public class ContaCorrente extends Conta {

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque na conta corrente: " + valor);
    }
    public void sacar(double valor, double taxa) {
        saldo -= (valor + taxa);
        System.out.println("Saque com taxa: " + (valor + taxa));
    }
}

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.saldo = 1000;
        cp.saldo = 1000;

        cc.sacar(100);
        cc.sacar(100, 5);

        cp.sacar(200);
        cp.sacar(200, 2);

        System.out.println("Saldo CC: " + cc.saldo);
        System.out.println("Saldo CP: " + cp.saldo);
    }
}

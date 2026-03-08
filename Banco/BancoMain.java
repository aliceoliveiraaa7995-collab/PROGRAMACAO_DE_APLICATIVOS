public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("123", "Joao", 500);

        conta.depositar(200);
        conta.sacar(256);

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}

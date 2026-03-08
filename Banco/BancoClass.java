class ContaBancaria{

    private String numeroConta;
    private String titular;
    private double saldo;

    ContaBancaria(){
        saldo = 0;
    }

    ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor de deposito invalido");
            return;
        }

        saldo += valor;
        System.out.println("Deposito realizado");
    }

    public void sacar(double valor){

        if(valor > saldo){
            System.out.println("Saldo insuficiente");
            return;
        }

        saldo -= valor;

        int v = (int) valor;

        int c100 = v / 100;
        v = v % 100;

        int c50 = v / 50;
        v = v % 50;

        int c20 = v / 20;
        v = v % 20;

        int c10 = v / 10;
        v = v % 10;

        int c5 = v / 5;
        v = v % 5;

        int c2 = v / 2;
        v = v % 2;

        int c1 = v / 1;

        System.out.println("Saque realizado: " + (int)valor);
        System.out.println(c100 + " cedulas de 100");
        System.out.println(c50 + " cedulas de 50");
        System.out.println(c20 + " cedulas de 20");
        System.out.println(c10 + " cedulas de 10");
        System.out.println(c5 + " cedulas de 5");
        System.out.println(c2 + " cedulas de 2");
        System.out.println(c1 + " cedulas de 1");
    }

    public double getSaldo(){
        return saldo;
    }
}

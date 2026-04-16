interface Pagamento {
    void pagar(double valor);
}

class CartaoCredito implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Cartão: " + valor);
    }
}

class Pix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pix: " + valor);
    }
}

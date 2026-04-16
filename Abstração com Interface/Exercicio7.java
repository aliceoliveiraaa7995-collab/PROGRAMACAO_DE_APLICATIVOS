interface Entrega {
    double calcularFrete(double peso);
}

class Correios implements Entrega {
    public double calcularFrete(double peso) {
        return peso * 5;
    }
}

class Transportadora implements Entrega {
    public double calcularFrete(double peso) {
        return peso * 3;
    }
}

interface Forma {
    double calcularArea();
}

class Quadrado implements Forma {
    double lado = 2;

    public double calcularArea() {
        return lado * lado;
    }
}

class Circulo implements Forma {
    double raio = 2;

    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}

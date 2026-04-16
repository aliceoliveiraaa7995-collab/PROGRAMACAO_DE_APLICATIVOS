public class Quadrado extends Forma {

    @Override
    public double calcularArea() {
        return 0; // sem valor definido
    }

    // Sobrecarga
    public double calcularArea(double lado, double ignorado) {
        return lado * lado;
    }
}

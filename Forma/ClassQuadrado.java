public class Quadrado extends Forma {

    @Override
    public double calcularArea() {
        return 0; 
    }
    public double calcularArea(double lado, double ignorado) {
        return lado * lado;
    }
}

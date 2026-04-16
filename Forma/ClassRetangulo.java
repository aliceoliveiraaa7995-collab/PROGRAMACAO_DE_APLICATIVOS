public class Retangulo extends Forma {

    @Override
    public double calcularArea() {
        return 0; // sem valor definido
    }

    // Sobrecarga
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
}

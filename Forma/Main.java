public class Main {
    public static void main(String[] args) {

        Quadrado q = new Quadrado();
        Retangulo r = new Retangulo();

        System.out.println("Área do quadrado: " + q.calcularArea(4, 0));
        System.out.println("Área do retângulo: " + r.calcularArea(4, 5));
    }
}

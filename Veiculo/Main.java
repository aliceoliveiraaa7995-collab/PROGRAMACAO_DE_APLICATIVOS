public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.ligar();
        carro.ligar(true);

        moto.ligar();
        moto.ligar(false);
    }
}

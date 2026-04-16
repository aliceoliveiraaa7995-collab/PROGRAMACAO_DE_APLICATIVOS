public class Moto extends Veiculo {

    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }

    // Sobrecarga
    public void ligar(boolean chavePresencial) {
        if (chavePresencial) {
            System.out.println("Moto ligada sem chave");
        } else {
            System.out.println("Moto ligada com chave");
        }
    }
}

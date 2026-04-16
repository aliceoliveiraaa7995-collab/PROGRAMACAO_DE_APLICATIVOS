public class Carro extends Veiculo {

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void ligar(boolean chavePresencial) {
        if (chavePresencial) {
            System.out.println("Carro ligado sem chave");
        } else {
            System.out.println("Carro ligado com chave");
        }
    }
}

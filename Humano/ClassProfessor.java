public class Professor extends Pessoa {

    @Override
    public void apresentar() {
        System.out.println("Sou um professor");
    }

    // Sobrecarga
    public void apresentar(String mensagem) {
        System.out.println("Professor: " + mensagem);
    }
}

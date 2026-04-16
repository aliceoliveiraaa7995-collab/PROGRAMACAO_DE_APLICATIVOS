public class Aluno extends Pessoa {

    @Override
    public void apresentar() {
        System.out.println("Sou um aluno");
    }

    public void apresentar(String mensagem) {
        System.out.println("Aluno: " + mensagem);
    }
}

public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        Professor p = new Professor();

        a.apresentar();
        a.apresentar("Estou estudando");

        p.apresentar();
        p.apresentar("Estou ensinando");
    }
}

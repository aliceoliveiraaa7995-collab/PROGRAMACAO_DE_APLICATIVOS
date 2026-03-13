public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.nome = "Alice";
        f.idade = 16;
        f.cargo = "Gerente";

        Cliente c = new Cliente();
        c.nome = "Bruno";
        c.idade = 19;
        c.email = "bruno@email.com";

        System.out.println("Funcionario:");
        f.exibirDados();

        System.out.println();

        System.out.println("Cliente:");
        c.exibirDados();
    }
}

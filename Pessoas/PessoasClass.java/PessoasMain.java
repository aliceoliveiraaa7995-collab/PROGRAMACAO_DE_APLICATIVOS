class Pessoa {
    String nome;
    int idade;

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Funcionario extends Pessoa {
    String cargo;

    void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
    }
}

class Cliente extends Pessoa {
    String email;

    void exibirDados() {
        super.exibirDados();
        System.out.println("Email: " + email);
    }
}

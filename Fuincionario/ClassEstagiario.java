public class Estagiario extends Funcionario {

    @Override
    public double calcularSalario() {
        return salario;
    }

    public double calcularSalario(double bonus) {
        return salario + bonus;
    }
}

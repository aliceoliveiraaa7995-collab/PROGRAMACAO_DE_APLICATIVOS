public class Gerente extends Funcionario {

    @Override
    public double calcularSalario() {
        return salario + 1000;
    }

    public double calcularSalario(double bonus) {
        return salario + bonus;
    }
}

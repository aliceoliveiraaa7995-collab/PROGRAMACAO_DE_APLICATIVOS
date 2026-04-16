public class Estagiario extends Funcionario {

    @Override
    public double calcularSalario() {
        return salario; // sem bônus
    }

    // Sobrecarga
    public double calcularSalario(double bonus) {
        return salario + bonus;
    }
}

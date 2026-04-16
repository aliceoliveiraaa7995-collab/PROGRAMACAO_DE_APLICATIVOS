public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.salario = 5000;

        Estagiario estagiario = new Estagiario();
        estagiario.salario = 1500;

        System.out.println("Salário gerente: " + gerente.calcularSalario());
        System.out.println("Salário gerente com bônus: " + gerente.calcularSalario(500));

        System.out.println("Salário estagiário: " + estagiario.calcularSalario());
        System.out.println("Salário estagiário com bônus: " + estagiario.calcularSalario(200));
    }
}

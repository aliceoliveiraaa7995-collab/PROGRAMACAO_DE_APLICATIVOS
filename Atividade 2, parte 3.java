import java.util.Scanner;
class Atividade_4 {
// Faça um algoritmo que leia 2 valores numéricos e um símbolo. Caso o símbolo seja um dos
// relacionados abaixo efetue a operação correspondente com os valores.
// a. “+” operação de soma
// b. “-” operação de subtração
// c. “*” operação de multiplicação
// d. “/” operação de divisão
// e. “**” exponencial
// Se o denominador for 0, informar ao usuário que a divisão não pode ser feita. Se o símbolo for diferente desses citados acima, escreva "impossível realizar a operação". Para sair 
// do programa deve ser digitado a palavra "EXIT".
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        String simbolo;
        while (true){
            System.out.println ("Digite o primeiro valor: ");
            double valor1 = sc.nextDouble();

            System.out.println ("Digite o segundo valor: ");
            double valor2 = sc.nextDouble();

            System.out.println ("Digite a operação (+, -, *, /, **) ou EXIT para sair");
            simbolo = sc.next();

            switch (simbolo) {
                case "+":
                    System.out.println("Resultado: " + (valor1 + valor2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (valor1 - valor2));
                    break;
                case "*":
                    System.out.println("Resultado: " + (valor1 * valor2));
                    break;
                case "/":
                    if (valor2 == 0){
                        System.out.println("Divisão por 0 não e permitida!");
                    } else {
                    System.out.println("Resultado: " + (valor1 / valor2));
                    }
                    break;
                case "**":
                    System.out.println("Resultado: " + Math.pow(valor1, valor2));
                    break;
                case "EXIT":
                    System.out.println ("Encerrando o programa...");
                    break;
                default: 
                    System.out.println ("Operação invalida!");
            }
        }
    }
}

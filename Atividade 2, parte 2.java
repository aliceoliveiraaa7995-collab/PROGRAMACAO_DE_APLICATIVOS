import java.util.Scanner;
class Atividade_3 {
// 2.Ler 4 números inteiros (usando vetor) e calcular a soma dos que forem par, 
// trate os possíveis erros.
    public static void main (String args[]){
        int [] vetor = new int [4];
        java.util.Scanner sc = new Scanner (System.in);
        int somaPar = 0;
        int i = 0;

        while (i < 4){
            int valor = 0;

            System.out.println ("Digite o valor: " +i);
            try {
                valor =  sc.nextInt ();
                vetor[i] = valor;
                if (valor % 2 == 0) {
                    somaPar = somaPar + valor;
                } else {
                    System.out.println("Digite novamente o valor: ");
                    sc.nextLine();
                    continue;
                }
            } catch (Exception e){
                System.out.println ("Digite novamente o valor: ");
                sc.nextLine();
                continue;
            }
            i++;
        }
        System.out.println ("A soma dos valores é: "+somaPar);
     }
}

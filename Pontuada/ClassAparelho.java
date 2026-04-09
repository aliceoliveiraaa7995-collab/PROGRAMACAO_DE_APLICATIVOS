class Aparelho extends Iphone {
   private String numero;

public Aparelho(String numero){
   this.numero = numero;
}
public void ligar (String numero){
   System.out.println("Ligando..." + numero);
}
public void atender(){
   System.out.println("Atendendo...");
}
public void iniciar(){
   System.out.println("Iniciando correio de voz...");
}
}  

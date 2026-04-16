public class Cachorro extends Animal(){
  @Override
  public void emitirSom (){
    System.out.println("Latido");
  }
  public void emitirSom(int vezes){
    for (int i = 0; i < vezes; i++){
      System.out.println("Latido:");
    }
  }
}

class Reprodutor extends Iphone  {
   private String musica;

public Reprodutor(String musica){
   this.musica = musica;
}
public void tocar(){
   System.out.println("Tocando música: ");
}
public void pausar(){
   System.out.println("Música pausada: ");
}
public void selecionar(String musica){
   System.out.println("Selecione uma musica: "+ musica);
}
}

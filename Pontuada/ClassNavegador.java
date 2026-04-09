class Navegador extends Iphone{
   private String url;

public Navegador(String url){
   this.url = url;
}
public void exibir(String url){
   System.out.println("Exibindo página..." + url);
}
public void adicionar(){
   System.out.println("Adicionando nova aba...");
}
public void atualizar(){
   System.out.println("Atualizando a página...");
}
}

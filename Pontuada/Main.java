public class Main {
    public static void main(String[] args) {

        Reprodutor r = new Reprodutor("Imagine");
        r.reproduzir(); 
        r.tocar();
        r.pausar();
        r.selecionar("Musica");

        Aparelho a = new Aparelho("1234-5678");
        a.ligar(); 
        a.ligar("1234-5678");
        a.atender();
        a.iniciar();

        Navegador n = new Navegador("google.com");
        n.navegar(); // herdado
        n.exibir("google.com");
        n.adicionar();
        n.atualizar();
    }
}

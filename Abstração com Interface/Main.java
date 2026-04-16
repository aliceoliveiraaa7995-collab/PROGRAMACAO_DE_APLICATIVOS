public class Main {
    public static void main(String[] args) {

        new CartaoCredito().pagar(100);
        new Pix().pagar(50);

        new Carro().ligar();
        new Moto().ligar();

        System.out.println(new Gerente().calcularBonus(1000));

        System.out.println(new Quadrado().calcularArea());

        new Email().enviarMensagem("Oi");

        new Televisao().ligar();

        System.out.println(new Correios().calcularFrete(10));

        System.out.println(new UsuarioComum().login("user", "123"));

        new ImpressoraLaser().imprimir("Teste");

        new ArquivoTexto().abrir();
    }
}

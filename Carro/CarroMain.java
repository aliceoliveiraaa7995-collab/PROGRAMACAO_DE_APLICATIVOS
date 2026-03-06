class Main{
    public static void main (String [] args){
        Carro carros = new Carro( "xxxx", 30, 80);

        System.out.print(carros.getVelocidadeAtual());
        carros.acelerar(20);
        System.out.print(carros.getVelocidadeAtual());
        carros.frear(10);
        System.out.print(carros.getVelocidadeAtual());
    }
}

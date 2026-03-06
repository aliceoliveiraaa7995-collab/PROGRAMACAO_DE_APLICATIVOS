class Carro {
    private String marca;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    Carro (){
        this.velocidadeAtual = 0;
    }

    Carro (String marca, int velocidadeAtual, int velocidadeMaxima){
        this.marca = marca;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar (int velocidadeAcelerar){
        
        if (velocidadeAtual < velocidadeMaxima && velocidadeAcelerar + velocidadeAtual < velocidadeMaxima){
            this.velocidadeAtual += velocidadeAcelerar;
            System.out.print("Nova velocidade cadastrada com sucesso!");
            return;
    } else if (velocidadeAtual >= velocidadeMaxima){
        this.velocidadeAtual = velocidadeAtual;
        System.out.print ("A velocidade foi redefinida ao limite pois já atingiu/excedeu a margem!");
        return;
    }
        System.out.print("Operação inválida!");
}

        
    public void frear (int velocidadeFrear){
        if (velocidadeFrear < velocidadeAtual && velocidadeAtual - velocidadeFrear >= 0){
            this.velocidadeAtual -= velocidadeFrear;
            System.out.print ("A velocidade foi reduzida com sucesso!");
            
        } else if (velocidadeAtual < velocidadeFrear){
            this.velocidadeAtual = velocidadeAtual;
            System.out.print ("A velocidade foi mantida pois excedeu o limite definido!");

        }
        



    }
    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }
    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

}

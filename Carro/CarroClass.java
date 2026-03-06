class Carro {
    String marca;
    int velocidadeAtual;
    int velocidadeMaxima;

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
        this.velocidadeAtual == velocidadeMaxima;
        System.out.print ("A velocidade foi redefinida ao limite pois já atingiu/excedeu a margem!")
    }

    public void frear (int velocidadeFrear){
        if (velocidadeFrear < velocidadeAtual && velocidadeAtual - velocidadeFrear > 0){
            
        }
    }
}

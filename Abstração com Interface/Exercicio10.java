interface Arquivo {
    void abrir();
    void fechar();
}

class ArquivoTexto implements Arquivo {
    public void abrir() { System.out.println("Texto aberto"); }
    public void fechar() { System.out.println("Texto fechado"); }
}

class ArquivoImagem implements Arquivo {
    public void abrir() { System.out.println("Imagem aberta"); }
    public void fechar() { System.out.println("Imagem fechada"); }
}

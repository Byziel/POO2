public class Animal {
    private String nome;
    private float comprimento;
    private int numero_de_patas;
    private String cor;
    private String ambientes;
    private float velocidade_media;

   public Animal(String nome, float comprimento,int numero_de_patas,String cor,String ambientes, float velocidade_media ){
       this.nome = "domenica";
       this.comprimento = 60;
       this.numero_de_patas = 4;
       this.cor = "branco";
       this.ambientes = "silvestre";
       this.velocidade_media = 64;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumero_de_patas() {
        return numero_de_patas;
    }

    public void setNumero_de_patas(int numero_de_patas) {
        this.numero_de_patas = numero_de_patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(String ambientes) {
        this.ambientes = ambientes;
    }

    public float getVelocidade_media() {
        return velocidade_media;
    }

    public void setVelocidade_media(float velocidade_media) {
        this.velocidade_media = velocidade_media;
    }
    public void dados() {
        System.out.println("Relatório do Animal:");
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " metros");
        System.out.println("Número de Patas: " + numero_de_patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambientes);
        System.out.println("Velocidade Média: " + velocidade_media + " km/h");
}
}




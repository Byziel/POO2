public class Mamifero extends Animal {
    private String alimento;


    public Mamifero(String nome, float comprimento, int numero_de_patas, String cor, String ambientes, float velocidade_media, String alimento) {

        super(nome, comprimento, numero_de_patas, cor, ambientes, velocidade_media);
        this.alimento = alimento;
    }


    public String getAlimento() {
        return alimento;
    }


    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }


    public void dadosMamifero() {
        System.out.println("DADOS DO MAMÍFERO:");
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento() + "m");
        System.out.println("Número de patas: " + getNumero_de_patas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbientes());
        System.out.println("Velocidade Média: " + getVelocidade_media() + " km/h");
        System.out.println("Alimento: " + alimento);
    }
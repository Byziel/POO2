public class Peixe extends Animal {

    private String caracteristica;
    public Peixe(String nome, float comprimento, int numero_de_patas, String cor, String ambiente, float velocidade_Media, String caracteristica) {
        super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade_Media);
        this.caracteristica = caracteristica;
    }
    public String getCaracteristica() {
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public void dadosPeixe() {
        System.out.println("Relatório do Peixe:");
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento() + " metros");
        System.out.println("Número de Patas: " + getNumero_de_patas();
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbientes());
        System.out.println("Velocidade Média: " + getVelocidade_media() + " km/h");
        System.out.println("Característica: " + caracteristica);
    }
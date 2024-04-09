public class TesteAnimais {
    public static void main(String[] args) {
        Mamifero vaca = new Mamifero("vaca", 157, 4, "preta", "silvestre", 2.0f, "");
        Peixe Tubarao = new Peixe("Tubarao", 150, 0, "braco", "Mar", 1.5f, "");
        Mamifero pinguim = new Mamifero("pinguim", 75, 2, "Branco", "Neve/agua", 0.5f, "");


        vaca.dados();
        System.out.println();
        Tubarao.dadosPeixe();
        System.out.println();
        pinguim.dadosMamifero();
    }
}


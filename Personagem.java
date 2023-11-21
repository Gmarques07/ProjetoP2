public class Personagem {
    String nome;
    int energia;

    Personagem(String nome,int energia) {
        this.nome = nome;
        this.energia = energia;
    }
    void atualizarEnergia(int incremento){
        if (incremento != 0 ) {
            this.energia += incremento;
            System.out.println("\n Devido aos ultimos acontecimentos, a energia de " + this.nome + " foi para " + this.energia + "." );
        }
    }
}
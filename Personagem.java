public class Personagem {
 private String nome;
 private int energia;

    public Personagem(String nome,int energia) {
        this.nome = nome;
        setEnergia(energia);
    }
    public String getNome() {
        return nome;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int novaEnergia) {
        if (novaEnergia < 0) {
            this.energia = 0;
        }
        else if (novaEnergia > 100) {
            this.energia = 100;
        }
        else {
            this.energia = novaEnergia;
        }
    }
    public void atualizarEnergia(int incremento){
        int novaEnergia = this.energia + incremento;
        setEnergia(novaEnergia);
        if (incremento != 0 ) {
            System.out.println("\n Devido aos ultimos acontecimentos, a energia de " + this.nome + " foi para " + this.energia + "." );
        }
    }
}
    
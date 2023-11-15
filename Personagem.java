public class Personagem {
    String nome;
    int hp;
    int energia;
    int força;

    Personagem(String nome, int hp, int energia, int força) {
        this.nome = nome;
        this.hp = hp;
        this.energia = energia;
        this.força = força;
    }
    void alteracaoEnergia(int aumento){
        if (aumento != 0 ) {
            this.energia += aumento;
            System.out.println("De repente após " + this.nome + " tomar a poção de energia, a sua energia aumentou " + aumento + " pontos, agora " + this.nome + " tem " + this.energia + " pontos de energia.");
        }
    }
    public void poção() {
        if (hp != 100 && hp < 100) {
            System.out.println("Destiny sua vida foi restaurada em 20 pontos.");
            hp = Math.min(100, hp + 20);
            System.out.println("Destiny agora possui " + hp + " pontos de vida.");
        } else if (hp == 100) {
            System.out.println("Sua vida está em 100.");}
        }
        public void treinar(){
            if (força != 100 && força < 100) {
                System.out.println("Destiny sua força aumentou 10 pontos.");
                força = força + 10;
                energia = energia - 20;
                System.out.println("Destiny agora possui " +força+ " pontos de força.");
                System.out.println("Destiny perdeu 20 pontos de energia no treinamento agora possui " +energia+ " pontos de energia.");    
            }
            else{
                System.out.println("Parabéns você chegou na força máxima dos mortais.");
            }
           }
}
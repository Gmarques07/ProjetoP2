public class Psecundario{
    static String nome = "Alastar";
    static int hp = 20;
    static int força = 50;
    static boolean ataque;
 
    public static void poção(){
     if (hp != 100 || hp < 100) {
         System.out.println(nome + " sua vida foi restaurauda 20 pontos.");
         hp = hp + 20;
         System.out.println(nome + " agora possui "+hp + " pontos de vida.");
     }
     else {
         System.out.println("sua vida está em 100.");
     }
    }
 
    public static void treinar(){
     if (força != 100 || força < 100) {
         System.out.println(nome + " sua força aumentou 10 pontos.");
         força = força + 10;
         System.out.println(nome + " agora possui " +força+ " pontos de força.");     
     }
     else{
         System.out.println("Parabéns você chegou na força máxima dos mortais.");
     }
    }
    public static void ataqueSec(){
        if (ataque = true && hp < 100) {
            System.out.println("Voce atacou");
            hp =  hp - força;
            System.out.println("Seu oponente agora tem " + hp + "%");
        }
       } 
  }
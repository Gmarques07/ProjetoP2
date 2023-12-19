import java.util.Map;
import java.util.Scanner;

public class Mprojeto {
    public static void main(String[] args) throws Exception {
    
        Scanner scan01 = new Scanner(System.in,"UTF-8");
        LeitorDeArquivos leitor = new LeitorDeArquivos();
        
        Map<String, Personagem> personagens = leitor.carregarPersonagens("rsc/Personagens.txt");
        Map<String, Capitulo> capitulos = leitor.carregarCapitulos("rsc/Capitulos.txt", personagens, scan01);

        Capitulo raiz = capitulos.get("Raiz");
        raiz.executar();
        scan01.close();
        }
} 
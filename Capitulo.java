import java.util.Scanner;

public class Capitulo {
    String texto;
    Personagem protagonista;
    Personagem Psecundario;
    int alteracaoEnergia;
    Scanner escaneador;
    int aumentoPersonagem1;
    int aumentoPersonagem2;
    String[] escolhas;

    public Capitulo(String texto, String [] escolhas, Personagem personagem1, Personagem personagem2, int alteracaoEnergia, Scanner escaneador){
        this.texto = texto;
        this.escolhas = escolhas;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = escaneador;
        this.protagonista = personagem1;
        this.Psecundario = personagem2;
    }
    public int escolher() {
        int resultado = -1;
        Scanner sc = new Scanner(System.in);
        boolean escolhaCorreta = false;

        while (!escolhaCorreta) {
            System.out.println("Escolha uma opção: ");

            for (int i = 0; i < escolhas.length; i++) {
                System.out.println((i + 1) + ">>>>> " + escolhas[i]);
            }
            
            String input = sc.nextLine();
        if (input.matches("\\d+")) { 
            int opcaoEscolhida = Integer.parseInt(input) - 1;
            if (opcaoEscolhida >= 0 && opcaoEscolhida < escolhas.length) {
                resultado = opcaoEscolhida;
                escolhaCorreta = true;
            } else {
                System.out.println("Opção inválida. Escolha uma opção entre 1 e " + escolhas.length + ".");
            }
        } else {
            System.out.println("Opção inválida. Escolha uma opção válida.");
        }
    }

        return resultado;
    }
    public void mostrar() {
        System.out.println(texto);
        protagonista.alteracaoEnergia(aumentoPersonagem1);
        Psecundario.alteracaoEnergia(aumentoPersonagem2);
    
        if (escolhas != null && escolhas.length > 0) {
            System.out.println("Escolhas disponíveis: ");
            for (int i = 0; i < escolhas.length; i++) {
                System.out.println((i + 1) + ". " + escolhas[i]);
            }
        }
    }
}
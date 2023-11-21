import java.util.Scanner;

public class Capitulo {
    String texto;
    Personagem personagem1;
    Personagem personagem2;
    Scanner escaneador;
    int incrementoPersonagem1;
    int incrementoPersonagem2;
    Escolha[] escolhas;

    public Capitulo(String texto, Personagem personagem1, Personagem personagem2, int incrementoPersonagem1, int incrementoPersonagem2, Scanner escaneador){
        this.texto = texto;
        this.escaneador = escaneador;
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.incrementoPersonagem1 = incrementoPersonagem1;
        this.incrementoPersonagem2 = incrementoPersonagem2;
        
    }
    public void executar() {
        mostrar();
    
        if (escolhas != null && escolhas.length > 0) {
            int capituloEscolhido = escolher();
    
            if (capituloEscolhido >= 0 && capituloEscolhido < escolhas.length) {
                escolhas[capituloEscolhido].proximo.executar();
            } else {
                System.out.println("Opção inválida. Escolha uma opção entre 1 e " + escolhas.length + ".");
            }
        } else {
            System.out.println("Fim da história.");
        }
    }

    public int escolher() {
        int resultado = -1;
        Scanner sc = new Scanner(System.in);
        boolean escolhaCorreta = false;

        while (!escolhaCorreta) {
            System.out.println("Escolha uma opção: ");

            for (int i = 0; i < escolhas.length; i++) {
                System.out.println((i + 1) + ">>>>> " + escolhas[i].texto);
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
        personagem1.atualizarEnergia(incrementoPersonagem1);
        personagem2.atualizarEnergia(incrementoPersonagem2);
    
        if (escolhas != null && escolhas.length > 0) {
            System.out.println("Escolhas disponíveis: ");
            for (int i = 0; i < escolhas.length; i++) {
                System.out.println((i + 1) + ". " + escolhas[i].texto);
            }
        }
    }
    }
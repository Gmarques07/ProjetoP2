import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo {
    private String texto;
    private Personagem personagem1;
    private Personagem personagem2;
    private int variacaoEnergiaPersonagem1;
    private int variacaoEnergiaPersonagem2;
    private ArrayList<Escolha> escolhas;

    public Capitulo(String texto, Personagem personagem1, Personagem personagem2, int variacaoEnergiaPersonagem1, int variacaoEnergiaPersonagem2, ArrayList<Escolha> escolhas) {
        this.texto = texto;
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.variacaoEnergiaPersonagem1 = variacaoEnergiaPersonagem1;
        this.variacaoEnergiaPersonagem2 = variacaoEnergiaPersonagem2;
        this.escolhas = escolhas;
    }

    public String getTexto() {
        return texto;
    }

    public Personagem getPersonagem1() {
        return personagem1;
    }

    public Personagem getPersonagem2() {
        return personagem2;
    }

    public int getVariacaoEnergiaPersonagem1() {
        return variacaoEnergiaPersonagem1;
    }

    public int getVariacaoEnergiaPersonagem2() {
        return variacaoEnergiaPersonagem2;
    }

    public ArrayList<Escolha> getEscolhas() {
        return escolhas;
    }

    public void setEscolhas(ArrayList<Escolha> escolhas) {
        this.escolhas = escolhas;
    }

    public void executar() {
        mostrar();

        if (escolhas != null && !escolhas.isEmpty()) {
            int escolhaFeita = escolher();

            if (escolhaFeita >= 0 && escolhaFeita < escolhas.size()) {
                escolhas.get(escolhaFeita).getProximo().executar();
            } else {
                System.out.println("Opção inválida. Escolha uma opção entre 1 e " + escolhas.size() + ".");
            }
        } else {
            System.out.println("Fim da história.");
        }
    }

    private int escolher() {
        int resultado = -1;
        Scanner sc = new Scanner(System.in);
        boolean escolhaCorreta = false;

        while (!escolhaCorreta) {
            System.out.println("Escolha uma opção: ");

            for (int i = 0; i < escolhas.size(); i++) {
                System.out.println((i + 1) + ">>>>> " + escolhas.get(i).getTexto());
            }

            String input = sc.nextLine();
            if (input.matches("\\d+")) {
                int opcaoEscolhida = Integer.parseInt(input) - 1;
                if (opcaoEscolhida >= 0 && opcaoEscolhida < escolhas.size()) {
                    resultado = opcaoEscolhida;
                    escolhaCorreta = true;
                } else {
                    System.out.println("Opção inválida. Escolha uma opção entre 1 e " + escolhas.size() + ".");
                }
            } else {
                System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }

        return resultado;
    }
    
    private void mostrar() {
        System.out.println(texto);
        personagem1.atualizarEnergia(variacaoEnergiaPersonagem1);
        personagem2.atualizarEnergia(variacaoEnergiaPersonagem2);

        if (escolhas != null && !escolhas.isEmpty()) {
            System.out.println("Escolhas disponíveis: ");
            for (int i = 0; i < escolhas.size(); i++) {
                System.out.println((i + 1) + ". " + escolhas.get(i).getTexto());
            }
        }
    }
}
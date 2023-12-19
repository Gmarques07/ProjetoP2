import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeitorDeArquivos {
    HashMap<String, Personagem> carregarPersonagens(String caminho) {
        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();

        File arquivo = new File(caminho);
        try {
            Scanner escaneador = new Scanner(arquivo);

            System.out.println("Carregando personagens... ");
            int i = 0;
            while (escaneador.hasNextLine()) {
                i++;
                String id = escaneador.nextLine(); // ID:
                String nome = escaneador.nextLine(); // Nome
                int energia = Integer.parseInt(escaneador.nextLine());

                escaneador.nextLine();
                System.out.println("Personagem " + i);

                personagens.put(id, new Personagem(nome, energia));
            }
            escaneador.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return personagens;
    }

    HashMap<String, Capitulo> carregarCapitulos(String caminho, Map<String, Personagem> personagens,
            Scanner escaneadorDoConsole) {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();

        File arquivo = new File(caminho);
        try {
            Scanner escaneadorDoArquivo = new Scanner(arquivo);

            System.out.println("Carregando capitulos... ");
            String linha = escaneadorDoArquivo.nextLine();
            while (escaneadorDoArquivo.hasNextLine()) {
                if (linha.equals("CAPITULO")) {
                    LerCapitulo(personagens, capitulos, escaneadorDoConsole, escaneadorDoArquivo);
                } else if (linha.equals("ESCOLHA")) {
                    LerEscolha(capitulos, escaneadorDoArquivo);
                }
                linha = escaneadorDoArquivo.nextLine();
            }
            escaneadorDoArquivo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return capitulos;
    }

    private void LerEscolha(HashMap<String, Capitulo> capitulos, Scanner escaneadorDeArquivo) {
        
        escaneadorDeArquivo.nextLine(); 
        String idCapituloDe = escaneadorDeArquivo.nextLine(); // ID do Capítulo DE
        escaneadorDeArquivo.nextLine(); 
        String idCapituloPara = escaneadorDeArquivo.nextLine(); // ID do Capítulo PARA
        escaneadorDeArquivo.nextLine(); 
    
        String textoDigitado = escaneadorDeArquivo.nextLine(); 
        String textoMostrado = escaneadorDeArquivo.nextLine(); 
    
        Capitulo capituloDe = capitulos.get(idCapituloDe);
        Capitulo capituloPara = capitulos.get(idCapituloPara);
    
        if (capituloDe != null && capituloPara != null) {
            capituloDe.getEscolhas().add(new Escolha(textoDigitado, textoMostrado, capituloPara));
        } else {
            System.err.println("Erro: Capítulo de origem ou destino não encontrado. ID Capítulo DE: " + idCapituloDe + ", ID Capítulo PARA: " + idCapituloPara);
        }
    }
    

    private void LerCapitulo(Map<String, Personagem> personagens, HashMap<String, Capitulo> capitulos,
            Scanner escaneadorDoConsole, Scanner escaneadorDoArquivo) {
        escaneadorDoArquivo.nextLine(); // ID
        String id = escaneadorDoArquivo.nextLine();

        escaneadorDoArquivo.nextLine(); // PERSONAGEM
        String idPersonagem1 = escaneadorDoArquivo.nextLine();
        String idPersonagem2 = escaneadorDoArquivo.nextLine();
        Personagem personagem1 = personagens.get(idPersonagem1);
        Personagem personagem2 = personagens.get(idPersonagem2);

        escaneadorDoArquivo.nextLine(); // TEXTO
        String linha = escaneadorDoArquivo.nextLine();
        String texto = "";
        while (!linha.equals("VARIACOES")) {

            if (linha.equals(idPersonagem1)) {
                texto = texto + personagem1.getNome();
            } else if (linha.equals(idPersonagem2)) {
                texto = texto + personagem2.getNome();
            } else {
                texto = texto + linha;
            }
            linha = escaneadorDoArquivo.nextLine();
            
        }

        int variacaoEnergiaPersonagem1 = Integer.parseInt(escaneadorDoArquivo.nextLine());
        int variacaoEnergiaPersonagem2 = Integer.parseInt(escaneadorDoArquivo.nextLine());

        System.out.println("Capitulo " + id);

        capitulos.put(id, new Capitulo(texto, personagem1, personagem2, variacaoEnergiaPersonagem1,
                variacaoEnergiaPersonagem2, new ArrayList<>()));

        escaneadorDoArquivo.nextLine();
    }
}
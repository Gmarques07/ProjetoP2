import java.util.Scanner;

public class Mprojeto {
    public static void main(String[] args) throws Exception {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("SEJA BEM VINDO AO LIVRO INTERATIVO WYD. ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\n");

        Scanner scan01 = new Scanner(System.in);

        Personagem protagonista = new Personagem("Destiny", 100);
        Personagem antagonista = new Personagem("Alastar", 100);
        
        Capitulo capitulo0 = new Capitulo("Você é um guerreiro solitário chamado de " + protagonista.getNome() + ", sua pequena jornada começa em uma pequena cidade chamada Erion, Erion é a cidade inicial para os mortais que estão em busca de evolução como guerreiros. Destiny acabou de chegar na cidade, com o objetivo de conhecer como as coisas funcionam ali pela cidade de Erion e buscar informações sobre missões ou tarefas que possam ajudar a cidade.\n" + "Agora preciso que você decida qual será a decisão inicial que Destiny vai tomar. OBS: As suas escolhas influenciam diretamente no destino final dessa história. \n", protagonista, antagonista, 0,0,scan01);
    
        Capitulo capitulo1 = new Capitulo(protagonista.getNome() + " decide dar uma volta pela cidade, conhecendo os habitantes locais. Encontra uma forja onde um ferreiro talentoso está disposto a forjar uma arma personalizada para você, com base no conhecimento e experiência que acumulou em Erion. \n O ferreiro  pede a ajuda para deter uma invasão de aranhas no deserto de noatum e pede para que " +protagonista.getNome() + " escolha entre duas armas muito raras entre os mortais da cidade de erion. O Arco divino e o martelo Mjolnir. \n"+ "Qual será a arma escolhida ?", protagonista, antagonista, 0,0,scan01);
        Capitulo capitulo11 = new Capitulo(protagonista.getNome() + " decide que a sua arma sera o Arco divino, por ter escolhido o Arco divino, foi capaz de conter toda a invasão do alto da torre sem sofrer nenhum dano, assim salvando a cidade da invasão.\n", protagonista, antagonista, 0,0,scan01);
        Capitulo capitulo12 = new Capitulo(protagonista.getNome() + " decide que a sua arma sera o Martelo Mjolnir, por ter escolhido o marterlo Mjolnir, vai na linha de frente na batalha contra a invasão das aranhas, porém acaba não resistindo ao veneno de tantas aranhas...", protagonista, antagonista, 2000,0,scan01);
       
        Capitulo capitulo21 = new Capitulo(protagonista.getNome() + " decide que primeiro vai procrurar por informações sobre missões na cidade de Erion. Assim encontra e vira amigo de um jovem guerreiro que também acabou de chegar na cidade, chamado de "+ antagonista.getNome() +"\n"+ " determinados a desvendar os mistérios que os trouxeram até ali.", protagonista, antagonista, 0,0,scan01);
        Capitulo capitulo22 = new Capitulo(protagonista.getNome() + " e "+antagonista.getNome()+ " decidem que vai em busca de mais informações na tarvena. Enquanto investigam, Alastar é emboscado por uma gangue local. Destiny, na taverna, nota sua ausência e parte para procurá-lo, apenas para encontrar Alastar ferido. Ele revela detalhes cruciais antes de falecer." , protagonista, antagonista, 0,-100,scan01);
        Capitulo capitulo23 = new Capitulo(protagonista.getNome() + " e "+antagonista.getNome()+ " decidem que é melhor seguir caminho para procurar um lugar para que possa descansar da sua viagem ate a cidade de Erion. Ao procurar por acomodações, Alastar é atacado, deixando Destiny sozinho e enfrentando novos desafios enquanto busca vingança ou justiça pela morte de seu companheiro." , protagonista, antagonista, 0,-100,scan01);

        capitulo0.setEscolhas(new Escolha[] { new Escolha("Explorar a cidade", capitulo1), new Escolha("Procurar por missões", capitulo21)});
        capitulo1.setEscolhas(new Escolha[] {new Escolha("Arco divino", capitulo11), new Escolha("Martelo mjolnir", capitulo12)});
        capitulo21.setEscolhas(new Escolha[]{new Escolha("Buscar informações na taverna da cidade. ", capitulo22), new Escolha("Buscar um local para descansar da viagem.", capitulo23)});
    

        Capitulo capituloRaiz = capitulo0;
        capituloRaiz.executar();

        scan01.close();
        }
} 

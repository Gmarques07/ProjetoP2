import java.util.Scanner;

public class Mprojeto01 {
    public static void main(String[] args) throws Exception {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("SEJA BEM VINDO AO LIVRO INTERATIVO WYD. ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\n");

        System.out.println("PARA INICIAR O LIVRO INTERATIVO DIGITE 1");
        int d01;
        Scanner scan01 = new Scanner(System.in);
        d01 = scan01.nextInt();

        Personagem protagonista = new Personagem("destiny", 100, 50, 20);
        Personagem Psecundario = new Personagem("alastar", 80, 50, 30);
        int escolha;
        Capitulo capitulo00 = new Capitulo ("Você é um guerreiro solitário chamado de Destiny, sua pequena jornada começa em uma pequena cidade chamada Erion, Erion é a cidade inicial para os mortais que estão em busca de evolução como guerreiros. Destiny acabou de chegar na cidade, com o objetivo de conhecer como as coisas funcionam ali pela cidade de Erion e buscar informações sobre missões ou tarefas que possam ajudar a cidade.\n" + "Agora preciso que você decida qual será a decisão inicial que Destiny vai tomar. OBS: As suas escolhas influenciam diretamente no destino final dessa história. \n" +"(Explorar a cidade de Erion) ou (Procurar informações sobre uma missão ou tarefa que possa ajudar a cidade) (EXPLORAR A CIDADE.) (PROCURAR POR MISSÕES.)", new String[]{"Explorar a cidade", "Procurar missões"}, protagonista, Psecundario, 0, scan01);
        Capitulo capitulo11 = new Capitulo ("Destiny decide dar uma volta pela cidade, conhecendo os habitantes locais. Encontra uma forja onde um ferreiro talentoso está disposto a forjar uma arma personalizada para você, com base no conhecimento e experiência que acumulou em Erion. \n O ferreiro pede para que Destiny escolha entre duas armas muito raras entre os mortais da cidade de erion. O Arco divino e o martelo Mjolnir. \n"+ "Qual será a arma escolhida ? (ARCO DIVINO) OU (MARTELO Mjolnir)", new String[]{" ARCO DIVINO ", " MARTELO MJOLNIR "}, protagonista, Psecundario, 0, scan01);
        Capitulo capitulo12 = new Capitulo ("Destiny decide que a sua arma sera o Arco divino, o ferreiro muito talentoso incia o processo para forjar sua nova arma. \n" + "Entretanto o ferreiro avisa a Destiny que para que ele possa ter a capacidade de empunhalar o Arco divino, ele precisará treinar para aumentar sua força. \n" + "Enquanto a sua nova arma está sendo forjada destiny vai até o centro de treinamento para mortais da cidade de Erion para adquirir um pouco mais de força. \n" + "Após 2 longas horas de treinamento inicial no centro da cidade, destiny sentiu que estava um pouco mais forte. \n", null, protagonista, Psecundario, 0, scan01);
        Capitulo capitulo13 = new Capitulo("Destiny decide que a sua arma sera o Martelo Mjolnir, o ferreiro muito talentoso incio o processo para forjar sua nova arma. \n" + "Entretanto o ferreiro avisa a Destiny que para que ele possa ter a capacidade de empunhalar o Arco divino, ele precisará treinar para aumentar sua força. \n" + "Enquanto a sua nova arma está sendo forjada destiny vai até o centro de treinamento para mortais da cidade de Erion para adquirir um pouco mais de força. \n" + "Após 2 longas horas de treinamento inicial no centro da cidade, destiny sentiu que estava um pouco mais forte. \n", null, protagonista, Psecundario, 0, scan01);
        Capitulo capitulo02 = new Capitulo("Destiny decide que primeiro vai procrurar por informações sobre missões e tarefas que existem na cidade de Erion. \n" + "Destiny visita a taverna local, onde muitos guerreiros se reúnem para compartilhar histórias e informações. Lá, destiny ouve falar que proximo da cidade de Erion existe um deserto chamado de Noatun. \n" + "Porém, Destiny ainda não encontrou um lugar para que pudesse passar a noite e descansar um pouco. \n" + "Destiny deve continuar na taverna em buscar de mais informações sobre o deserto de Noatun ou seguir caminho para encontrar um local para se acomodar melhor na cidade? (CONTINUAR EM BUSCA DE INFORMAÇÕES) OU (BUSCAR UM LOCAL PARA SE ACOMODAR)",new String[]{"CONTINUAR EM BUSCA DE INFORMAÇÕES", "BUSCAR UM LOCAL PARA SE ACOMODAR"}, protagonista, Psecundario, 0, scan01);
        Capitulo capitulo21 = new Capitulo("Destiny decide que vai continuar em busca mais informações na tarvena. \n" + "Destiny descobre um pouco mais sobre o deserto, Noatun é um deserto onde guerreiros se encontram para batalhar entre si e onde também vivem monstros. \n" + "O dono da taverna ao ver que destiny estava mesmo destemido a conhcer e expolorar o deserto, lhe entrega um presente como estimulo a sua bravura. \n" + "O velho que é dono da taverna lhe entrega uma poção que aumenta instantaneamente a sua energia em 20 pontos, destiny toma sua poção antes de ir embora. \n" + "De repente após Destiny tomar a poção de energia, a sua energia aumentou 20 pontos, agora destiny tem " + protagonista.energia +" pontos de energia.", null, protagonista, Psecundario, 20, scan01);
        Capitulo capitulo22 = new Capitulo("Destiny decide que é melhor seguir caminho para procurar um lugar para que possa descansar da sua viagem ate a cidade de Erion. \n" + "Destiny depois de alguns minutos vagando pela cidade finalmente consegue encontrar uma pousada para guerreios viajantes. Onde consegue se instalar para que no outro dia continuasse em busca de seu objetivo. \n" + "De manhã após a noite de descanso na pousada, destiny encontra no salão principal um outro jovem guerreiro, chamado Alastar, que está seriamente ferido de uma batalha no deserto de Noatum. \n" + "Destiny rapidademente pega sua poção de cura que sempre leva em suas viajens e entrega para alastar. \n" + "Pede para que ele tome a poção para que pudesse se recuperar da batalha rapidamente. \n" + "Alastar assim toma a poção dada por destiny.", null, protagonista, Psecundario, 0, scan01);
        
        if (d01 == 1) {
            capitulo00.mostrar();
            escolha = capitulo00.escolher();
        
            if (escolha == 0) {
                int escolha01;
                capitulo11.mostrar();
                escolha01 =  capitulo11.escolher();
        
                if (escolha01 == 0) {
                    capitulo12.mostrar();
                    protagonista.treinar();
                } else if (escolha01 == 1) {
                    capitulo13.mostrar();
                    protagonista.treinar();
                }
            } else if (escolha == 1) {
                int escolha02;
                capitulo02.mostrar();
                escolha02 = capitulo02.escolher();
        
                if (escolha02 == 0) {
                    capitulo21.mostrar();
                } else if (escolha02 == 1) {
                    capitulo22.mostrar();
                    Psecundario.poção();
                }
            }
        } else {
            System.out.println("O LIVRO INTERATIVO NÃO FOI INICIADO.");
        } 
    }
}  
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

        if (d01 == 1) {
            
            // inicio da história
            
            System.out.println("\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Você é um guerreiro solitário chamado de Destiny, sua pequena jornada começa em uma pequena cidade chamada Erion, Erion é a cidade inicial para os mortais que estão em busca de evolução como guerreios.");
            System.out.println("\n");
            System.out.println("Destiny acabou de chegar na cidade, com o objetivo de conhecer como as coisas funcionam ali pela cidade de erion e buscar informações sobre missões ou tarefas que possam ajudar a cidade.");
            System.out.println("\n");        
            System.out.println("Agora preciso que você decida qual será a decisão inicial que destiny vai tomar. OBS: As suas escolhas influênciam diretamente no destino final dessa história.");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            
            System.out.println("\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1. Explorar a cidade de Erion e conhecer os habitantes ou 2. Procurar informações sobre uma missão ou tarefa que possa ajudar a cidade(1 PARA EXPLORAR A CIDADE.) (2 PROCRURAR POR MISSÕES.)");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
           
            int a1;
            Scanner scan = new Scanner(System.in);
            a1 = scan.nextInt();
            System.out.println("\n");

            if (a1 == 1) {
                System.out.println("Destiny decide dar uma volta pela cidade, conhecendo os habitantes locais. Encontra uma forja onde um ferreiro talentoso está disposto a forjar uma arma personalizada para você, com base no conhecimento e experiência que acumulou em Erion.");
                System.out.println("O ferreiro pede para que Destiny escolha entre duas armas muito raras entre os mortais da cidade de erion. O Arco divino e o martelo Mjolnir.");
                System.out.println("\n");
                System.out.println("Qual será a arma escolhida ? (1 PARA ARCO DIVINO)(2 PARA MARTELO Mjolnir)");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("\n");
                int b1;
                Scanner scann = new Scanner(System.in);
                b1 = scann.nextInt();
                System.out.println("\n");
                

                if (b1 == 1) {
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Destiny decide que a sua arma sera o Arco divino, o ferreiro muito talentoso incia o processo para forjar sua nova arma.");
                    System.out.println("Entretanto o ferreiro avisa a Destiny que para que ele possa ter a capacidade de empunhalar o Arco divino, ele precisará treinar para aumentar sua força.");
                    System.out.println("Enquanto a sua nova arma está sendo forjada destiny vai até o centro de treinamento para mortais da cidade de Erion para adquirir um pouco mais de força.");
                    System.out.println("Após 2 longas horas de treinamento inicial no centro da cidade, destiny sentiu que estava um pouco mais forte.");
                    Protagonista.treinar();
                    System.out.println("Destiny volta para a forja muito animado e apreensível se o treino foi o suficiente para obter a capacidade.");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                }
                    else if (b1 == 2) {
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Destiny decide que a sua arma sera o Martelo Mjolnir, o ferreiro muito talentoso incio o processo para forjar sua nova arma.");
                    System.out.println("Entretanto o ferreiro avisa a Destiny que para que ele possa ter a capacidade de empunhalar o Mjolnir, ele precisará treinar para aumentar sua força.");
                    System.out.println("Após 2 longas horas de treinamento inicial no centro da cidade, destiny sentiu que estava um pouco mais forte.");
                    Protagonista.treinar();
                    System.out.println("Destiny volta para a forja muito animado e apreensível se o treino foi o suficiente para obter a capacidade necessária.");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                }
            }
            else if (a1 == 2) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Destiny decide que primeiro vai procrurar por informações sobre missões e tarefas que existem na cidade de Erion.");
                System.out.println("Destiny visita a taverna local, onde muitos guerreiros se reúnem para compartilhar histórias e informações. Lá, destiny ouve falar que proximo da cidade de Erion existe um deserto chamado de Noatun.");
                System.out.println("Porém, Destiny ainda não encontrou um lugar para que pudesse passar a noite e descansar um pouco.");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Destiny deve continuar na taverna em buscar de mais informações sobre o deserto de Noatun ou seguir caminho para encontrar um local para se acomodar melhor na cidade?");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("DIGITE 1 PARA (CONTINUAR EM BUSCA DE INFORMAÇÕES) OU 2 PARA (BUSCAR UM LOCAL PARA SE ACOMODAR)");

            int b2;
            Scanner scannn = new Scanner(System.in);
            b2 = scannn.nextInt();
            System.out.println("\n");

            if (b2 == 1) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Destiny decide que vai continuar em busca mais informações na tarvena.");
                System.out.println("Destiny descobre um pouco mais sobre o deserto, Noatun é um deserto onde guerreiros se encontram para batalhar entre si e onde também vivem monstros. ");
                System.out.println("Destiny fica muito animado para ir testar sua capacidade em batalha no deserto, mas primeiro ele decide que vai arrumar um local para que possa passar a noite e decider o seu caminho no dia seguinte.");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
            else if (b2 == 2) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Destiny decide que é melhor seguir caminho para procurar um lugar para que possa descansar da sua viagem ate a cidade de Erion.");
                System.out.println("Destiny depois de alguns minutos vagando pela cidade finalmente consegue encontrar uma pousada para guerreios viajantes. Onde consegue se instalar para que no outro dia continuasse em busca de seu objetivo.");
                System.out.println("De manhã após a noite de descanso na pousada, destiny encontra no salão principal um outro jovem guerreiro, chamado Alastar, que está seriamente ferido de uma batalha no deserto de Noatum.");
                System.out.println("Destiny rapidademente pega sua poção de cura que sempre leva em suas viajens e entrega para alastar.");
                System.out.println("Pede para que ele tome a poção para que pudesse se recuperar da batalha rapidamente.");
                System.out.println("Alastar assim toma a poção dada por destiny.");
                Psecundario.poção();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }  
        }
     
        } else {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("O LIVRO INTERATIVO NÃO FOI INICIADO. ");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }
}
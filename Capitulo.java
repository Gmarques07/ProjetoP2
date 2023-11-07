import java.util.Scanner;

public class Capitulo {
    String texto;
    String escolha1;
    String escolha2;
    Personagem protagonista;
    Personagem Psecundario;
    int alteraçãoEnergia;
    Scanner escaneador;
    int aumentoPersonagem1;
    int aumentoPersonagem2;

    public Capitulo(String texto, String escolha1, String escolha2, Personagem personagem1, Personagem personagem2, int alteraçãoEnergia, Scanner escaneador){
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.alteraçãoEnergia = alteraçãoEnergia;
        this.escaneador = escaneador;
        this.protagonista = personagem1;
        this.Psecundario = personagem2;
    }
    public int escolher() {
        int resultado = 0;
        Scanner sc = new Scanner(System.in);
        boolean escolhaCorreta = false;

        while (!escolhaCorreta) {
            System.out.println("Escolha 1 ou 2:");
            String escolha = sc.nextLine();

            if (escolha.equals("1")) {
                resultado = 1;
                escolhaCorreta = true;
            } else if (escolha.equals("2")) {
                resultado = 2;
                escolhaCorreta = true;
            } else {
                System.out.println("Escolha inválida. Por favor, digite 1 ou 2.");
            }
        }

        return resultado;
    }
    public void mostrar(){
        System.out.println(texto);
        protagonista.alteraçãoEnergia(aumentoPersonagem1);
        Psecundario.alteraçãoEnergia(aumentoPersonagem2);
    }
}
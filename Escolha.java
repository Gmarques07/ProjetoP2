public class Escolha {
 private String texto;
 private Capitulo proximo;

   public Escolha(String texto, String textoMostrado, Capitulo proximo){
        this.texto = texto;
        this.proximo = proximo;
    }
    
    public String getTexto() {
        return texto;
    }

    public Capitulo getProximo() {
        return proximo;
    }
}

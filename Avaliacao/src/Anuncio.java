import javax.swing.*;

public abstract class Anuncio {
    private String título;
    private String texto;
    double valor;

    public Anuncio(){

    }
    public Anuncio(String t, String te, double valor){


    }


    public String getTexto() {
        return texto;
    }

    public String getTítulo() {
        return título;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setTítulo(String título) {
        this.título = título;
    }


    public abstract void valorAPagar();

    public void obterDados(){
         setTítulo(JOptionPane.showInputDialog("Digite o titulo do Anúncio: "));
         setTexto(JOptionPane.showInputDialog("Digite o texto do Anúncio: "));

    }



}

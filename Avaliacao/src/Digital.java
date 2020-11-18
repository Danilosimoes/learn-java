import javax.swing.*;

public class Digital extends Anuncio implements CalculaLucro {

    private int tempo;
    private double direitosAutorais;
    private String tipoAnimacao;

    public Digital(){

    }
    public Digital(int tm, double da, String ta, double v){
        super("", "", v);

        tempo = tm;
        direitosAutorais = da;
        tipoAnimacao = ta;
        valor = v;



    }

    public double getDireitosAutorais() {
        return direitosAutorais;
    }

    public int getTempo() {
        return tempo;
    }

    public String getTipoAnimacao() {
        return tipoAnimacao;
    }

    public void setDireitosAutorais(double direitosAutorais) {
        this.direitosAutorais = direitosAutorais;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setTipoAnimacao(String tipoAnimacao) {
        this.tipoAnimacao = tipoAnimacao;
    }

    @Override
    //obtendo os dados
    public void obterDados() {
        super.obterDados();

        tipoAnimacao = (JOptionPane.showInputDialog("Qual o tipo de animação: "));
        direitosAutorais = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor dos direitos autorais?: "));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo: "));

    }

    @Override
    //calculando o valor
    public void valorAPagar() {

        valor = (tempo * 150) + direitosAutorais;



    }

    @Override
    //calculando o lucro
    public double lucro() {
        return valor * 0.15;
    }

    public void mostraDados(){
        JOptionPane.showMessageDialog(null, "Titulo: " + getTítulo() + "\nTexto: " + getTexto() +
                "\nValor da animação: R$ " + this.valor  +  "\nLucro: R$ " + lucro());
    }



}

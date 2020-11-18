import javax.swing.*;

public class Impresso extends Anuncio implements CalculaLucro{

    String imagem;
    private double largura, altura;
    private int qtdeAnuncios;


    public Impresso() {

    }

    public Impresso(String i, double l, double a, int q, double v) {
        super("", "", v);
        imagem = i;
        largura = l;
        altura = a;
        qtdeAnuncios = q;
        valor = v;
    }



    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public int getQtdeAnuncios() {
        return qtdeAnuncios;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setQtdeAnuncios(int qtdeAnuncios) {
        this.qtdeAnuncios = qtdeAnuncios;
    }



    @Override
    public void obterDados() {
        //obtendo dados da super classe
        super.obterDados();

        largura =(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ")));
        altura = (Double.parseDouble(JOptionPane.showInputDialog("Digite a largura: ")));
        qtdeAnuncios = (Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de anuncios: ")));


    }

    @Override
    //calculando o valor
    public void valorAPagar() {
        valor = (largura * altura * 50) + (qtdeAnuncios * 0.5);
    }

    public void mostraDados(){
        JOptionPane.showMessageDialog(null, "Título: " + this.getTítulo() + "\nTexto do Anuncio: "
                + getTexto() + "\nValor: R$ " + this.valor + "\nLucro: R$ " + lucro());
    }

    @Override
    //calculando o lucro
    public double lucro() {
        return valor * 0.1 ;
    }



}

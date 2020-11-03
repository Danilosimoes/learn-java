import javax.swing.*;

public class Produto {
    private String codigo, nome, modelo, fabricante;
    private double vista, juros;
    private int qtdeEstoque;


    public Produto(String codigo, String nome, String modelo, String fabricante, double vista,
                   double juros, int qtdeEstoque ){

        this.codigo = codigo;
        this.nome = nome;
        this. modelo = modelo;
        this.fabricante = fabricante;
        this.juros = vista;
        this.vista = juros;
        this.qtdeEstoque = qtdeEstoque;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getVista() {
        return vista;
    }

    public void setVista(double vista) {
        this.vista = vista;
    }

    public double getJuros(double novo_juros) {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    @Override
    public String toString() {
        return
                "Codigo: " + codigo +
                "\nNome: " + nome +
                "\nModelo: " + modelo +
                "\nFabricante: " + fabricante +
                String.format(" \nValor à vista R$ %.2f", vista) +
                String.format(" \nValor com juros R$ %.2f", juros) +
                "\nQuantidade em estoque: " + qtdeEstoque;
    }










}


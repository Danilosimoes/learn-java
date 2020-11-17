public class Produto {
    private String codigo, nome, modelo, fabricante;
    private double comImposto, semImposto;
    private int qtdeEstoque;


    public Produto(String codigo, String nome, String modelo, String fabricante, double semImposto,
                   double comImposto, int qtdeEstoque ){
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.semImposto = semImposto;
        this.comImposto = comImposto;
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

    public double getComImposto() {
        return comImposto;
    }

    public void setComImposto(double comImposto) {
        this.comImposto = comImposto;
    }


    public void setSemImposto(double semImposto) {
        this.semImposto = semImposto;
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
                        String.format(" \nValor sem imposto R$ %.2f", semImposto) +
                        String.format(" \nValor com imposto R$ %.2f", comImposto) +
                        "\nQuantidade em estoque: " + qtdeEstoque;
    }










}


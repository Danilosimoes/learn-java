import javax.swing.*;
import java.util.ArrayList;

public class Equipamento extends Produto implements Calculos {

    private static ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Equipamento(String codigo, String nome, String modelo, String fabricante, double semImposto, double comImposto, int qtdeEstoque) {
        super("", "","", "", semImposto, comImposto, qtdeEstoque);
    }

    public static ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    static public void adicionar(Produto p) {
        listaProdutos.add(p);
    }


    static public void buscar() {
        Produto pdt = null;
        String codigo;
        codigo = JOptionPane.showInputDialog("Digite o codigo:");

        for (Produto produto : listaProdutos) {

            if (produto.getCodigo().equals(codigo)) {
                pdt = produto;
            }
        }
        if (pdt != null) {
            JOptionPane.showMessageDialog(null, pdt);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }

    }



    static void mostrarMenu() {
        JOptionPane.showMessageDialog(null, "EQUIPAMENTOS DE INFORMÁTICA" + "\n1 - CADASTRAR" + "\n2 - ALTERAR DADOS" + "\n3 - PESQUISAR"
                + "\n4 - TOTAL DO IMPOSTO DO FABRICANTE" + "\n5 - MÉDIA DE PREÇOS DO MODELO" + "\n6 - PRODUTO EM MAIOR QUANTIDADE DO MODELO"
                + "\n7 - SAIR");
    }

    public static void alterar() {

        String codigo = JOptionPane.showInputDialog("Digite o codigo que deseja alterar os dados");
        Produto qtde = null;


        for (Produto pdt : listaProdutos) {

            if (pdt.getCodigo().equals(codigo)) {
                qtde = pdt;
            }
            if (qtde != null) {

                String novo_nome = JOptionPane.showInputDialog("Digite o novo nome");
                String novo_modelo = JOptionPane.showInputDialog("Digite o novo modelo");
                String novo_fabricante = JOptionPane.showInputDialog("Digite o novo fabricante");
                double novo_vista = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor a vista"));
                double novo_juros = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor com juros"));
                int novo_qtdeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade"));
                pdt.setNome(novo_nome);
                pdt.setModelo(novo_modelo);
                pdt.setFabricante(novo_fabricante);
                pdt.setSemImposto(novo_vista);
                pdt.setComImposto(novo_juros);
                pdt.setQtdeEstoque(novo_qtdeEstoque);
                JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO!!");

            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
            }
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void media() {

    }

    @Override
    public int maiorQtde() {
        return 0;
    }

    public static double totalImposto(String fabricante){
        double totalImposto= 0;

        for(Produto produto: listaProdutos) {
            if (produto.getFabricante().equals(fabricante)) {
                double imposto = produto.getComImposto() * produto.getQtdeEstoque();
                totalImposto = totalImposto + imposto;
            }
        }
        return totalImposto;
    }

    public static double mediaModelo(String modelo){
        int quant = 0;
        double media = 0;

        for(Produto produto: listaProdutos){
            if(produto.getModelo().equals(modelo)){
                media = media + produto.getComImposto();
                quant++;
            }
        }

        return media  = media/quant;
    }

    public static void maiorQuantidadeModelo(String modelo){
        String codigoProduto = "";
        int maiorQuantidade = -9999999;
        int quant = -1;

        for(Produto produto : listaProdutos){
            if(produto.getModelo().equals(modelo)){
                if(produto.getQtdeEstoque() > maiorQuantidade){
                    maiorQuantidade= produto.getQtdeEstoque();
                    codigoProduto = produto.getCodigo();
                }
            }
        }

        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto pdt;
            pdt = listaProdutos.get(i);
            if (pdt.getCodigo().equals(codigoProduto)) {
                quant = i;
            }
        }

        if (quant != -1) {
            JOptionPane.showMessageDialog(null, listaProdutos.get(quant).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }


    }
}


import javax.swing.*;
import java.util.ArrayList;
import java.util.Optional;

public class Equipamento extends Produto implements Calculos {


    private static ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Equipamento(String codigo, String nome, String modelo, String fabricante, double vista, double juros, int qtdeEstoque) {
        super("", "", "", "", vista, juros, qtdeEstoque);
    }

    public static ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    static public void adicionar(Produto p) {
        listaProdutos.add(p);
    }


    static public void buscar() {
        Produto qtde = null;
        String codigo;
        codigo = JOptionPane.showInputDialog("Digite o codigo:");

        for (Produto produto : listaProdutos) {
            Produto pdt;
            pdt = produto;
            if (pdt.getCodigo().equals(codigo)) {
                qtde = pdt;
            }
        }
        if (qtde != null) {
            JOptionPane.showMessageDialog(null, listaProdutos.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }

    }


    static void mostarMenu() {
        JOptionPane.showMessageDialog(null, "EQUIPAMENTOS DE INFORMÁTICA" + "\n1 - CADASTRAR" + "\n2 - ALTERAR DADOS" + "\n3 - PESQUISAR"
                + "\n4 - TOTAL DO IMPOSTO DO FABRICANTE" + "\n5 - MÉDIA DE PREÇOS DO FABRICANTE" + "\n6 - PRODUTO EM MAIOR QUANTIDADE DO FABRICANTE"
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
                pdt.setVista(novo_vista);
                pdt.setJuros(novo_juros);
                pdt.setQtdeEstoque(novo_qtdeEstoque);
                JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO!!");

            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
            }
        }
    }


    /*public static void alterar() {
        String codigo = JOptionPane.showInputDialog("Digite o codigo que deseja alterar os dados");

        Produto produto = null;

        // syntax sugar
        for(Produto p : listaProdutos){
            if (p.getCodigo().equals(codigo)) {
                produto = p;
            }
        }

        if(produto != null){
            String novo_nome = JOptionPane.showInputDialog("Digite o novo nome");
            String novo_modelo = JOptionPane.showInputDialog("Digite o novo modelo");
            String novo_fabricante = JOptionPane.showInputDialog("Digite o novo fabricante");
            double novo_vista = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor a vista"));
            double novo_juros = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor com juros"));
            int novo_qtdeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade"));
            produto.setNome(novo_nome);
            produto.setModelo(novo_modelo);
            produto.setFabricante(novo_fabricante);
            produto.setVista(novo_vista);
            produto.setJuros(novo_juros);
            produto.setQtdeEstoque(novo_qtdeEstoque);
            JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO!!");
        }else{
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }

    }*/

    /*public static void alertar() {

        String x = "xpto";
        String y = "XPTO";

        x.equalsIgnoreCase(y);

        String codigo = JOptionPane.showInputDialog("Digite o codigo que deseja alterar os dados");

        Optional<Produto> optional = listaProdutos.stream()
                .filter(produto -> produto.getCodigo().equalsIgnoreCase(codigo))
                .findFirst();

        if (optional.isPresent()) {
            Produto produto = optional.get();
            String newNameOfProduct = JOptionPane.showInputDialog("Digite o novo nome");
            String novoModelo = JOptionPane.showInputDialog("Digite o novo modelo");
            String novo_fabricante = JOptionPane.showInputDialog("Digite o novo fabricante");
            double novo_vista = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor a vista"));
            double novo_juros = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor com juros"));
            int novo_qtdeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade"));
            produto.setNome(newNameOfProduct);
            produto.setModelo(novoModelo);
            produto.setFabricante(novo_fabricante);
            produto.setVista(novo_vista);
            produto.setJuros(novo_juros);
            produto.setQtdeEstoque(novo_qtdeEstoque);
            JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO!!");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }

        System.out.println(listaProdutos);
    }*/


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


}


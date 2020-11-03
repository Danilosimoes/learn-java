import javax.swing.*;
import java.util.ArrayList;

public class Equipamento extends Produto implements Calculos {



    private static ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Equipamento(String codigo, String nome, String modelo, String fabricante, double vista, double juros, int qtdeEstoque) {
        super("", "","", "", vista, juros, qtdeEstoque);
    }

    public static ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    static public void adicionar(Produto p) {
        listaProdutos.add(p);
    }


    static public void buscar() {
        int qtde = -1;
        String codigo;
        codigo = JOptionPane.showInputDialog("Digite o codigo:");

        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto pdt;
            pdt = listaProdutos.get(i);
            if (pdt.getCodigo().equals(codigo)) {
                qtde = i;
            }
        }
        if (qtde != -1) {
            JOptionPane.showMessageDialog(null, listaProdutos.get(qtde).toString());
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
        int qtde = -1;
        String codigo = JOptionPane.showInputDialog("Digite o codigo que deseja alterar os dados");
        String novo_nome = JOptionPane.showInputDialog("Digite o novo nome");
        String novo_modelo = JOptionPane.showInputDialog("Digite o novo modelo");
        String novo_fabricante = JOptionPane.showInputDialog("Digite o novo fabricante");
        double novo_vista = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor a vista"));
        double novo_juros = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor com juros"));
        int novo_qtdeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade"));

        for (int i = 0; i < listaProdutos.size(); i++){
            Produto pdt;
            pdt = listaProdutos.get(i);
            if (pdt.getCodigo().equals(codigo)){
                qtde= i;
            }
            if (qtde != -1){
                    listaProdutos.get(i).setNome(novo_nome);
                    listaProdutos.get(i).setModelo(novo_modelo);
                    listaProdutos.get(i).setFabricante(novo_fabricante);
                    listaProdutos.get(i).setVista(novo_vista);
                    listaProdutos.get(i).setJuros(novo_juros);
                    listaProdutos.get(i).setQtdeEstoque(novo_qtdeEstoque);
                    JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO!!");

            }else {
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

    
}


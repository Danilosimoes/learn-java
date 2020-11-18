import javax.swing.*;

public class App {
    public static void main(String[] args) {

        Produto produto;
        int menu = 0;

        do {
            try {


                Equipamento.mostrarMenu();
                menu = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção"));

                switch (menu) {
                    case 1 -> {
                        String codigo = JOptionPane.showInputDialog("Digite o codigo").toUpperCase();
                        String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
                        String modelo = JOptionPane.showInputDialog("Digite o modelo").toUpperCase();
                        String fabricante = JOptionPane.showInputDialog("Digite o fabricante").toUpperCase();
                        double semImposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor sem imposto"));
                        double comImposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor com imposto"));
                        int qtdeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
                        produto = new Produto(codigo, nome, modelo, fabricante, semImposto, comImposto, qtdeEstoque);
                        Equipamento.adicionar(produto);
                        JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO!!");
                    }
                    case 2 -> Equipamento.alterar();
                    case 3 -> Equipamento.buscar();
                    case 4 -> {
                        String fabricanteTotalImposto = JOptionPane.showInputDialog("Digite o fabricante").toUpperCase();
                        double totalImposto = Equipamento.totalImposto(fabricanteTotalImposto);
                        JOptionPane.showMessageDialog(null, "Total em imposto desse fabricante: " + totalImposto);
                    }
                    case 5 -> {
                        String modeloMedia = JOptionPane.showInputDialog("Digite o modelo").toUpperCase();
                        double media = Equipamento.mediaModelo(modeloMedia);
                        JOptionPane.showMessageDialog(null, "Media do modelo: " + media);
                    }
                    case 6 -> {
                        String maiorQuantModelo = JOptionPane.showInputDialog("Digite o modelo").toUpperCase();
                        Equipamento.maiorQuantidadeModelo(maiorQuantModelo);
                    }
                    case 7 -> JOptionPane.showMessageDialog(null, "OBRIGADO!");
                    default -> JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
                }


            }catch (NullPointerException ex){
                JOptionPane.showMessageDialog(null, "Numero invalido");


            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Numero invalido");

            }

        }
        while (menu != 7);
    }

}



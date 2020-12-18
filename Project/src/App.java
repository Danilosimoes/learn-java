import javax.swing.*;

public class App {
    public static void main(String[] args) {

        Produto produto;


        String codigo, nome, modelo, fabricante;
        double vista, juros;
        int qtdeEstoque;
        int menu = 0;


        do {
            try{
                Equipamento.mostarMenu();
                menu = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção"));
                switch (menu) {

                    case 1:
                        codigo = JOptionPane.showInputDialog("Digite o codigo").toUpperCase();
                        nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
                        modelo = JOptionPane.showInputDialog("Digite o modelo").toUpperCase();
                        fabricante = JOptionPane.showInputDialog("Digite o fabricante").toUpperCase();
                        vista = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a vista"));
                        juros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor com juros"));
                        qtdeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

                        produto = new Produto(codigo, nome, modelo, fabricante, vista, juros, qtdeEstoque);

                        Equipamento.adicionar(produto);

                        JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO!!");
                        break;
                    case 2:
                        Equipamento.alterar();
                        break;

                    case 3:
                        Equipamento.buscar();
                        break;
                    case 4:
                        break;


                    case 5:
                        break;


                    case 6:
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "OBRIGADO!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");

                }

            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Numero invalido");
            }

        } while (menu != 7);
    }
    

}



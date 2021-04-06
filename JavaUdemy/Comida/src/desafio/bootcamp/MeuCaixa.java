package desafio.bootcamp;

/**
 * @author danil
 * Entendendo a lógica de um caixa eletronico
 */

public class MeuCaixa {



    public static void main(String[] args) {
        int valor = 11257;
        int n1 = 100;
        int n2 = 50;
        int n3 = 20;
        int n4 = 10;
        int n5 = 5;
        int n6 = 2;
        int n7 = 1;
        int qtdeN1 = valor/n1;
        int e = valor - qtdeN1*n1;
        int qtdeN2 = e/n2;
        int g = e-qtdeN2*n2;
        int qtdeN3 = g/n3;
        int j = g/n4;
        int qtdeN5 = g/n5;
        int l = g-qtdeN5*n5;
        int qtdeN6 = l/2;
        int n = l-qtdeN6*n6;
        int qtdeN7 = n/n7;
        int duvida = g%50;



        System.out.println(qtdeN1 + " notas de 100");
        System.out.println(e + " sobrou");
        System.out.println(qtdeN2 + " notas de 50");
        System.out.println(g + " sobrou");
        System.out.println(qtdeN3 + " notas de 20");
        System.out.println(g + " sobrou");
        System.out.println(j + " notas de 10");
        System.out.println(g + " sobrou");
        System.out.println(qtdeN5 + " notas de 5");
        System.out.println(l + " sobrou");
        System.out.println(qtdeN6 + " notas de 2");
        System.out.println(n + " sobrou");
        System.out.println(qtdeN7 + " notas de 1");
        System.out.println(duvida);





    }
}

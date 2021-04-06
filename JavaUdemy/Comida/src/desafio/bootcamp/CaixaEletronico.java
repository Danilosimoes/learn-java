package desafio.bootcamp;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author danil
 * Primeiro app do caixa eletronico, proximos passos é melhorar e limpar esse código
 */

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota;
        int valor;
        int total;
        double faltam;

        valor = leitor.nextInt();
        System.out.println(valor);

        nota = 100;
        total = (int) (valor / nota);
        faltam = valor % nota;
        System.out.printf(total + " nota(s) de R$%.2f ", nota);
        valor = (int) faltam;

        nota = 50;
        total = (int) (valor / nota);
        faltam = valor % nota;
        System.out.printf("\n" + total + " nota(s) de R$%.2f ", nota);
        valor = (int) faltam;

        nota = 20;
        total = (int) (valor / nota);
        faltam = valor % nota;
        System.out.printf("\n" + total + " nota(s) de R$%.2f ", nota);
        valor = (int) faltam;

        nota = 10;
        total = (int) (valor / nota);
        faltam = valor % nota;
        System.out.printf("\n" + total + " nota(s) de R$%.2f ", nota);
        valor = (int) faltam;

        nota = 5;
        total = (int) (valor / nota);
        faltam = valor % nota;
        System.out.printf("\n" + total + " nota(s) de R$%.2f ", nota);
        valor = (int) faltam;

        nota = 2;
        total = (int) (valor / nota);
        faltam = valor % nota;
        System.out.printf("\n" + total + " nota(s) de R$%.2f ", nota);
        valor = (int) faltam;

        nota = 1;
        total = (int) (valor / nota);
        faltam = valor % nota;
        System.out.printf("\n" + total + " nota(s) de R$%.2f ", nota);
    }
}

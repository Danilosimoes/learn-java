package br.com.array;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        double media = 0;
        int qtdeNotas = 0;
        double total = 0;

        Scanner leitor = new Scanner(System.in);


        System.out.println("Quantas notas você gostaria de inserir? ");
        qtdeNotas = leitor.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas[i] = leitor.nextDouble();

        }

        for (double nota: notas){
            total +=nota;


        }
        media = total/notas.length;
        System.out.println("A soma total é " + total);
        System.out.println("A média total é " + media);

        leitor.close();
    }

}

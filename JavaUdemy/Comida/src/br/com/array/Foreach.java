package br.com.array;

public class Foreach {
    public static void main(String[] args) {
        double [] notas = {9.9, 8.7, 7.2, 7.9};

        for (int i = 0; i < notas.length ; i++) {
            System.out.println(notas[i] + " ");
        }

        System.out.println();

        for (double nota: notas) {
            System.out.println(nota + " ");
        }
    }
}

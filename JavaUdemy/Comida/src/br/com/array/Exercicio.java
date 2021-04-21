package br.com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        int qtdeNotas = 0;
        int maior = 0;
        double somatorio = 0;
        double notaMaior = -9999;


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que voce deseja inserir: ");

        qtdeNotas = leitor.nextInt();

        double[] notasAlunoA = new double[qtdeNotas];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 5.4;
        notasAlunoA[2] = 9;


        //System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        //System.out.println(totalAlunoA/ notasAlunoA.length);


        final double notaArmazenada = 5.8;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};


        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length ; i++) {
            totalAlunoB += notasAlunoB[i];

        }
        //System.out.println(totalAlunoB/ notasAlunoB.length);
        //System.out.println(notasAlunoB[notasAlunoB.length -1]);
        for(double nota: notasAlunoB) {
            System.out.println("As notas são: " + nota);

            if (nota > 6){
                maior ++;
                somatorio += nota;



            }
            if (nota > notaMaior){
                notaMaior = nota;
            }




        }
        System.out.println("*****");
        System.out.println("A quantidade de notas maiores que 6 são: " + maior);
        System.out.println("A somatória é: " + somatorio);
        System.out.println("A maior nota é: " + notaMaior);
    }
}

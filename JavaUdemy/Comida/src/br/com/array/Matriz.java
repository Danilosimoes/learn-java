package br.com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double total= 0;

        System.out.println("Digite quantos alunos tem na turma: ");
        int alunosTurma = leitor.nextInt();

        System.out.println("Digite quantas notas terá o aluno: ");
        int notasAluno = leitor.nextInt();

        double[][] alunos = new double[alunosTurma][notasAluno];

        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < alunos[i].length; j++) {
                System.out.println("Informe a nota " + (j+1) + " do aluno" + (i+1));
                alunos[i][j] = leitor.nextDouble();
                total += alunos[i][j];

            }

        }
        double media = total / (alunosTurma*notasAluno);
        System.out.println(media);

        for (double[] notasAlunos : alunos){
            System.out.println(Arrays.toString(notasAlunos));
        }
        leitor.close();


    }
}

package desafio.bootcamp;

import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double km;
        double lt;
        double total;


        km = leitor.nextDouble();
        lt = leitor.nextDouble();

        total = km/lt;

        System.out.printf("%.3f", total);
        System.out.print(" km/l");




    }
}

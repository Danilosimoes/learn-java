package desafio.bootcamp;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;



public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        float a;
        int count;
        int total = 0;

        for (count = 1; count <= 5; count ++){
            a = leitor.nextFloat();

            if (a > 0) {
                total++;}

        }




        System.out.println("Valores positivos = " + total);
    }
}
package desafio.bootcamp;

import java.io.IOException;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int a = 0;
        a = entrada.nextInt();
        for (int i = 0 ; i <= a ; i++) {
            if (i % 2 == 0 ) System.out.println(i);
        }
    }

}


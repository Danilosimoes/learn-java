package desafio.bootcamp;

import java.io.IOException;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
            int par = 0;
            int impar = 0;
            int pos = 0;
            int neg = 0;
            int cont = 0;
            int a = 0;



//continue a solução
            for (cont = 1; cont <=5; cont++) {
                a = leitor.nextInt();
                if (a % 2 == 0){
                    par++;
                } else impar++;
                if (a > 0){
                    pos++;
                }
                if (a < 0){
                    neg ++;
                }



            }
//insira suas variaveis corretamente
            System.out.println(par + " valor(es) par(es)");
            System.out.println(impar + " valor(es) impar(es)");
            System.out.println(pos + " valor(es) positivo(s)");
            System.out.println(neg + " valor(es) negativo(s)");
        }

    }

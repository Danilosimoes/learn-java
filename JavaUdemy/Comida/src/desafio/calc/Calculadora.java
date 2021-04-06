package desafio.calc;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        double resultado = 0;
        int menu = 0;

        System.out.println("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o número: ");
        double num2 = entrada.nextDouble();



        do {


            System.out.println("Qual a op?: ");
            menu = entrada.nextInt();



            switch (menu) {


                case 1 -> {
                    resultado = num1 + num2;
                    System.out.println(resultado);

                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.println(resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    System.out.println(resultado);
                }
                case 4 -> {
                    resultado = num1 / num2;
                    System.out.println(resultado);
                }
                case 5 -> {
                    System.out.println("Obrigado");
                }
                default -> System.out.println("Operação incorreta");
            }



        } while (menu != 5);




    }
}

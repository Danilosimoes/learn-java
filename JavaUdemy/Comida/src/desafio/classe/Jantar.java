package desafio.classe;

import desafio.classe.Comida;

public class Jantar {

    public static void main(String[] args) {
        Comida c1 = new Comida("Strogonoff", 0.50);
        Comida c2 = new Comida("Arroz", 0.80);
        Pessoa p1 = new Pessoa("Danilo", 70);

        System.out.println(p1.apresentar());

        p1.comer(c1);

        System.out.println(p1.apresentar());

        p1.comer(c2);

        System.out.println(p1.apresentar());


    }



}

import java.util.Scanner;

public class TesteAnuncio {
    public static void main(String[] args) {

        Impresso i1;
        Digital d1;

        //Impresso
        i1 = new Impresso();
        //obtendo os dados
        i1.obterDados();
        // calculando os valores
        i1.valorAPagar();
        // mostrando os dados
        i1.mostraDados();


        // Digital
        d1 = new Digital();
        d1.obterDados();
        d1.valorAPagar();
        d1.mostraDados();










    }
}

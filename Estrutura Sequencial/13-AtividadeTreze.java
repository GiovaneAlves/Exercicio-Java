import java.util.Scanner;

public class AtividadeTreze  {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        
        System.out.println ("Digite à sua altura:");
            double h = input.nextDouble ();
            double pesoIdeal = (62.1*h-44.7);

        System.out.println("Seu peso ideal é  "+pesoIdeal+ "Kg" );

        input.close();

    }
}
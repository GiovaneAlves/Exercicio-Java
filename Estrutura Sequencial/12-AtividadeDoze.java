import java.util.Scanner;

public class AtividadeDoze  {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println ("Digite à sua altura:");
            double h = input.nextDouble ();
            double pesoIdeal = (72.7*h-58);
        System.out.println("Seu peso ideal é  "+pesoIdeal+ "Kg" );

        input.close();

    }
}
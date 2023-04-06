import java.util.Scanner;

public class AtividadeOito  {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Tabuada: digite o número desejado:");
            int a = input.nextInt();
            int i = 0;

        while(i != 11){

        System.out.print(a*i+ ", ");
 
            ++i;
        }
        System.out.print ("\n");

        input.close();
    }
}

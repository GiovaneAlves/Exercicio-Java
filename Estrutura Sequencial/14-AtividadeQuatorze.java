import java.util.Scanner;

public class AtividadeQuatorze   {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println ("Digite A e B respectivamente:");
            int a,b,c;

            a = input.nextInt();
            b = input.nextInt();
            c = a;
            a = b;
            b = c;
        System.out.println ("A= "+a);
        System.out.println ("B= "+b);

        input.close();

    }
}

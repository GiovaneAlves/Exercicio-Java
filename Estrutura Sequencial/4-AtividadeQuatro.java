import java.util.Scanner;

public class AtividadeQuatro    {

	public static void main(String[] args) {

	    Scanner n = new Scanner (System.in);

		System.out.println("Digite o comprimento da diagonal:");
		    double d1 = n.nextDouble ();

		System.out.println("Digite o comprimento da outra diagonal:");
		    double d2 = n.nextDouble ();
		    double total =  ((d1*d2)/2);

		System.out.println("A áréa do losango é: "+total);

        input.close();
	}
}

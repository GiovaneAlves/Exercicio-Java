import java.util.Scanner;

public class AtividadeCinco {

	public static void main(String[] args) {

	    Scanner n = new Scanner (System.in);

		System.out.println("Qual temperatura em Cº?");
		    double t1 = n.nextDouble  ();

		System.out.println("Cº");
		    double tfinal =  (t1*1.8 + 32);

		System.out.println("É igual à "+tfinal+ " ºF");

        input.close();
	}
}

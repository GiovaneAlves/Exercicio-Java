import java.util.Scanner;

public class AtividadeDois  {

	public static void main(String[] args) {

	    Scanner n = new Scanner (System.in);

		System.out.println("Digite o ano de nascimento");
		    int nasc = n.nextInt ();
            
		System.out.println("Digite o ano atual:");
		    int atual = n.nextInt ();

		    int idade = atual - nasc;
		    int fut = 2050 - nasc;
		System.out.println("Você tem "+idade+ " anos.");

		System.out.println("Sua idade em 2050 será "+fut+ " anos.");

        input.close();
	}
}

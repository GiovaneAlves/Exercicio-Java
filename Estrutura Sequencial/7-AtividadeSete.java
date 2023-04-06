import java.util.Scanner;

public class AtividadeSete	{

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
            float salarioAtual,salarioMinimo,porcentagem;

        System.out.println ("Digite o valor do salário mínimo:");
            salarioMinimo = input.nextFloat ();

        System.out.println ("Digite o valor do seu salário atual:");
            salarioAtual = input.nextFloat ();

            porcentagem = salarioAtual/salarioMinimo;

        System.out.println ("Seu salário é: "+porcentagem+ " Salários mínimo.");

        input.close();

    }
}
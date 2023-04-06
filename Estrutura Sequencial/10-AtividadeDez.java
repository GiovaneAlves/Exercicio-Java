import java.util.Scanner;

public class AtividadeDez   {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
            double valorGasto,gorjeta,total;

        System.out.println ("Qual o gasto?");
            valorGasto = input.nextDouble();
            gorjeta = valorGasto*0.1;
            total = valorGasto+gorjeta;

        System.out.println ("O valor total é: "+total+ " R$ \nSendo "+gorjeta+" R$ de gorjeta.");

        input.close();

    }
}
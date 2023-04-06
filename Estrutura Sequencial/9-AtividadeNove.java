import java.util.Scanner;

public class AtividadeNove  {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
            double numero,quadrado2,cubico3,raiz2,raiz3;

        System.out.println("Digite um numero positivo:");
            numero = input.nextDouble();

        while (numero<=0){ 

        System.out.println ("Número não válido, digite outro positivo:");
            numero = input.nextDouble();
        }

            quadrado2 = Math.pow(numero, 2);
        System.out.println("Seu número ao quadrado é: "+quadrado2);
            cubico3 = Math.pow(numero, 3);
        System.out.println("Seu número ao cubo é: "+cubico3);
            raiz2 = Math.sqrt(numero);
        System.out.println("Sua raíz quadrada é: "+raiz2);
            raiz3 = Math.cbrt(numero);
        System.out.println("Sua raíz cúbica é: " +raiz3);

        input.close();

    }
}
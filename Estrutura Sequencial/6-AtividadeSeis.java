import java.util.Scanner;

public class AtividadeSeis  {

    public static void main(String[] args) {

        Scanner ent = new Scanner (System.in);

        System.out.println ("Digite os coeficientes: a, b, c respectivamente:");

            int a = ent.nextInt ();
            int b = ent.nextInt ();
            int c = ent.nextInt ();

            double delta = (Math.pow(b,2) - (4*a*c));

        if (delta<0) { 
        
        System.out.println ("Esses números não possuem raizes reais");
        }
        else if (delta>=0){
    
        System.out.println ("Seu delta é: "+delta);
            double x =  Math.sqrt(delta);
            double y1 = (-b + x)/ (2*a);
            double y2 = (-b -x)/ (2*a);

        System.out.println ("Suas raizes são: "+y1+ " e " +y2+ " respectivamente.");
        }

        input.close();
    }
}

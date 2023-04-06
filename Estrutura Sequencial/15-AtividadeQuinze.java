import java.util.Scanner;

public class AtividadeQuinze    {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
            int totalEleitores,primeiroCandidato,segundoCandidato,nulo,a,b;

        System.out.println ("Qual o total de eleitores?");
            totalEleitores = input.nextInt();

        System.out.println ("Quantos votos teve o candidato 1?");
            primeiroCandidato = input.nextInt();

        System.out.println ("Quantos votos teve o candidato 2?");
            segundoCandidato = input.nextInt();
            nulo = totalEleitores-(primeiroCandidato+segundoCandidato);
            a = totalEleitores-(segundoCandidato+nulo);
            b = totalEleitores-(primeiroCandidato+nulo);

        System.out.println ("Candidato número 1 teve "+(a*100/totalEleitores)+" % dos votos");

        System.out.println ("Candidato número 2 teve "+(b*100/totalEleitores)+" % dos votos");

        System.out.println ("Votos nulos somam "+(nulo*100/totalEleitores)+" % dos votos");

        input.close();

    }
} 

package rr.senac.br;

import java.util.Scanner;
public class Pessoas {
    public static void main(String[] args) {
        people P1 = new people();
        Scanner leia = new Scanner(System.in);
        P1.setNome("Vinicus");
        P1.setIdade(18);
        P1.setCpf("999.999.999.999");

        System.out.println("O que a pessoa deve fala?");
        String fala = leia.nextLine();
        P1.setFala(fala);

        System.out.println("Quantos passos ele vai dar?");
        int passo = leia.nextInt();
        P1.setPasso(passo);


        P1.getNome();
        P1.getIdade();
        P1.getCpf();
        P1.getFala();
        P1.getPasso();
    }
}
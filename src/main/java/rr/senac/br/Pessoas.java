package rr.senac.br;

import java.util.Scanner;
public class Pessoas {
    public static void main(String[] args) {
        people P1 = new people();
        Scanner leia = new Scanner(System.in);
        P1.setNome("Vinicus");
        P1.setIdade(18);
        P1.setCpf("999.999.999.999");

        P1.getNome();
        P1.getIdade();
        P1.getCpf();
        
    }
}
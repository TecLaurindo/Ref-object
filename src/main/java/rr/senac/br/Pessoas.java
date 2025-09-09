package rr.senac.br;

import java.util.Scanner;
public class Pessoas {
    public static void main(String[] args) {
        people p1 = new people();
        Scanner leia = new Scanner(System.in);
        p1.setNome("Vinicus");
        p1.setIdade(18);
        p1.setCpf("999.999.999.999");
        p1.setEmail("tecnicolaurindo@gmail.com");
        p1.setTelefone("(95) 98428-6676");
        p1.setEndereço("Av. Glycon de Paiva, 252, centro");
        p1.setData("19/05/2007");


        p1.getNome();
        p1.getIdade();
        p1.getCpf();
        p1.getEmail();
        p1.getTelefone();
        p1.getEndereço();
        p1.getData();
    }
}
package rr.senac.br;

public class Main {
    public static void main(String[] args) {
        People p1 = new People(
                "Vinicius",
                18,
                "063.855.999.011",
                "95 984286676",
                "Rua do fulano",
                "19/05/2007",
                "tecteste@gmail.com",
                "Slk não compensa",
                6
        );
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        p1.getNome();
        p1 .getIdade();
        p1.getEmail();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
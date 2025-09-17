package rr.senac.br.testes;
import rr.senac.br.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {
        System.out.println("TESTE DA CLASSE FUNCIONARIO");

        Funcionario funcionarioFake = new Funcionario(
                "T.I",
                "1023203203",
                52000,
                "informatica",
                "vinicius",
                18,
                "06399999930",
                "95991393490",
                "na pqp",
                "19/05/2007",
                "vini@gmail.com",
                "eu sou a Lei",
                5
        );
        assertEquals("Engenheiro de soft", funcionarioFake.getCargo(), "Cargo");
    }

    public static void assertEquals(String esperando, String valorObtido, String campo){
        if (esperando.equals(valorObtido)){
            System.out.println("O campo " + campo + " ok " + valorObtido );
        }else {
            System.out.println(" O campo " + campo + " erro " + valorObtido);
        }
    }
}

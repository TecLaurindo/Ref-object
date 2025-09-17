package rr.senac.br.Test;

import rr.senac.br.Funcionario;

public class FuncTest {

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

            assertEquals(5000, funcionarioFake.getSalario(), "Salario");

            assertEquals("Engenheiro de soft", funcionarioFake.getNome(), "Nome");
        }

        public static void assertEquals(String esperando, String valorObtido, String campo){
            if (esperando.equals(valorObtido)){
                System.out.println("O campo " + campo + " ok " + valorObtido );
            }else {
                System.out.println(" O campo " + campo + " erro " + valorObtido);
            }
        }
        public static void assertEquals(double esperando, double valorObtido, String campo){
            if (Math.abs(esperando - valorObtido) > 0.00001) {
                System.out.println("O valor esperado " + esperando + " não é igual ao valor obtido " + valorObtido);
            }else {
                System.out.println("Teste OK! O valor esperado " + esperando + "é igual ao valor obtido " + valorObtido);
            }
        }
        public static void assertEquals2(String esperando2, String valorObtido2, String campo){
            if (esperando2.equals(valorObtido2)){
                System.out.println("O campo " + campo + " ok " + valorObtido2 );
            }else {
                System.out.println(" O campo " + campo + " erro " + valorObtido2);
            }
        }
    }


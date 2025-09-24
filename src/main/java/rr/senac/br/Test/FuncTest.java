package rr.senac.br.Test;

import rr.senac.br.Funcionario;

public class FuncTest {

        public static void main(String[] args) {
            System.out.println("TESTE DA CLASSE FUNCIONARIO");

            Funcionario funcionarioFake = new Funcionario(
                    "Eng de Software",
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

            assertEqualsD1(5000, funcionarioFake.getSalario(), "Salario");

            assertEquals("T.I", funcionarioFake.getSetor(), "Setor");

            assertEquals("Vinicius", funcionarioFake.getNome(), "Nome");

            assertEqualsD1(18, funcionarioFake.getIdade(), "Idade");

            assertEquals("06385330230", funcionarioFake.getCpf(), " CPF ");

            assertEquals("95991393490", funcionarioFake.getTelefone(), "Telefone");

            assertEquals("na rua", funcionarioFake.getEndereço(), "endereço");

            assertEquals("19/05/2006", funcionarioFake.getData(), "Data");

            assertEquals("vini@gmil.com", funcionarioFake.getEmail(), "Email");

            assertEquals("eu sou a Lei", funcionarioFake.getCargo(), "Cargo");

            assertEqualsD1(5, funcionarioFake.getPasso(), "passos");
        }

        public static void assertEquals(String esperando, String valorObtido, String campo){
            if (esperando.equals(valorObtido)){
                System.out.println("O campo " + campo + " ok " + valorObtido );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido);
            }
        }
        public static void assertEqualsD1(double esperando, double valorObtido, String campo){
            if (Math.abs(esperando - valorObtido) > 0.00001) {
                System.out.println("O valor esperado " + esperando + " não é igual ao valor obtido " + valorObtido);
            }else {
                System.out.println("Teste OK! O valor esperado " + esperando + "é igual ao valor obtido " + valorObtido);
            }
        }
}
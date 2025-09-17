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

            assertEquals3("Vinicius", funcionarioFake.getNome(), "Nome");

            assertEqualsD2(18, funcionarioFake.getIdade(), "Idade");

            assertEquals3("06385330230", funcionarioFake.getCpf(), " CPF ");

            assertEquals3("95991393490", funcionarioFake.getTelefone(), "Telefone");

            assertEquals("na rua", funcionarioFake.getEndereço(), "endereço");

            assertEquals("19/05/2006", funcionarioFake.getData(), "Data");

            assertEquals4("vini@gmil.com", funcionarioFake.getEmail(), "Email");

            assertEquals4("eu sou a Lei", funcionarioFake.getCargo(), "Cargo");

            assertEqualsD2(5, funcionarioFake.getPasso(), "passos");
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
        public static void assertEquals2(String esperando2, String valorObtido2, String campo){
            if (esperando2.equals(valorObtido2)){
                System.out.println("O campo " + campo + " ok " + valorObtido2 );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido2);
            }
        }
        public static void assertEquals3(String esperando3, String valorObtido3, String campo){
            if (esperando3.equals(valorObtido3)){
                System.out.println("O campo " + campo + " ok " + valorObtido3 );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido3);
            }
        }
        public static void assertEqualsD2(int esperando, int valorObtido, String campo){
            if (Math.abs(esperando - valorObtido) > 0.00001) {
                System.out.println("O valor esperaado " + esperando + " não e igual ao valor obtido " + valorObtido);
            }else {
                System.out.println("Teste OK o valor esperado " + esperando + "não é igual ao valor obtido " + valorObtido);
            }
        }
        public static void assertEquals4(String esperando4, String valorObtido4, String campo){
            if (esperando4.equals(valorObtido4)){
                System.out.println("O campo " + campo + " ok " + valorObtido4 );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido4);
            }
        }
        public static void assertEquals5(String esperando5, String valorObtido5, String campo){
            if (esperando5.equals(valorObtido5)){
                System.out.println("O campo " + campo + " ok " + valorObtido5 );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido5);
            }
        }
        public static void assertEquals6(String esperando6, String valorObtido6, String campo){
            if (esperando6.equals(valorObtido6)){
                System.out.println("O campo " + campo + " ok " + valorObtido6 );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido6);
            }
        }
        public static void assertEquals7(String esperando7, String valorObtido7, String campo){
            if (esperando7.equals(valorObtido7)){
                System.out.println("O campo " + campo + " ok " + valorObtido7 );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido7);
            }
        }
        public static void assertEquals8(String esperando8, String valorObtido8, String campo){
            if (esperando8.equals(valorObtido8)){
                System.out.println("O campo " + campo + " ok " + valorObtido8 );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido8);
            }
        }
        public static void assertEquals9(String esperando9, String valorObtido9, String campo){
            if (esperando9.equals(valorObtido9)){
                System.out.println("O campo " + campo + " ok " + valorObtido9 );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido9);
            }
        }
        public static void assertEquals10(String esperando10, String valorObtido10, String campo){
            if (esperando10.equals(valorObtido10)){
                System.out.println("O campo " + campo + " ok " + valorObtido10 );
            }else {
                System.out.println(" O campo " + campo + " ERRO " + valorObtido10);
            }
        }
        public static void assertEquals11(String esperando11, String valorObtido11, String campo){
            if (esperando11.equals(valorObtido11)){
                System.out.println("O campo " + campo + " ok " + valorObtido11 );
            }else {
                System.out.println("O campo " + campo + " ERRO " + valorObtido11);
            }
        }
        public static void assertEquals12(String esperando12, String valorObtido12, String campo){
            if (esperando12.equals(valorObtido12)){
                System.out.println("O campo " + campo + " ok " + valorObtido12 );
            }else {
                System.out.println("O campo " + campo + " ERRO " + valorObtido12);
            }
        }
        public static void assertEqualsD3(int esperando3, int valorObtido3, String campo){
            if (Math.abs(esperando3 - valorObtido3) > 0.00001) {
                System.out.println("O valor esperado " + campo + " é diferente do valos obtido " +  valorObtido3);
            }
        }
}
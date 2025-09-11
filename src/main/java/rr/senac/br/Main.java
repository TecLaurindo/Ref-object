package rr.senac.br;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu gargo: ");
        String cargo = leia.nextLine();

        System.out.print("Digite sua matricula: ");
        String matricula = leia.nextLine();

        System.out.println("Digite o salario: ");
        double salario = leia.nextDouble();

        System.out.println("Digite o setor: ");
        String setor = leia.nextLine();

        System.out.println("Digite o nome: ");
        String nome = leia.nextLine();

        System.out.println("Digite a Idade: ");
        int idade = leia.nextInt();

        System.out.println("Digite o CPF: ");
        String cpf = leia.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = leia.nextLine();

        System.out.println("Digite o endereco: ");
        String endereco = leia.nextLine();

        System.out.println("Digite o data de nascimento: ");
        String dataNascimento = leia.nextLine();

        System.out.println("Digite o email: ");
        String email = leia.nextLine();

        System.out.println("Digite as Falas: ");
        String Fala = leia.nextLine();

        System.out.println("Digite a quantidade de Passos: ");
        int Passo = leia.nextInt();

        Funcionario f1 = new Funcionario(
                cargo,
                matricula,
                salario,
                setor,
                nome,
                idade,
                cpf,
                telefone,
                endereco,
                dataNascimento,
                email,
                Fala, Passo
        );
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        f1.getCargo();

        f1.getSalario();
        f1.getNome();
        f1.getSetor();
        f1.getTelefone();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
    }
}

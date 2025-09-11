package rr.senac.br;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu gargo: ");
        String cargo = leia.nextLine();

        System.out.print("Digite sua matricula: ");
        String matricula = leia.nextLine();

        System.out.print("Digite o salario: ");
        double salario = leia.nextDouble();

        System.out.print("Digite o setor: ");
        String setor = leia.nextLine();

        System.out.print("Digite o nome: ");
        String nome = leia.nextLine();

        System.out.print("Digite a Idade: ");
        int idade = leia.nextInt();

        System.out.print("Digite o CPF: ");
        String cpf = leia.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = leia.nextLine();

        System.out.print("Digite o endereco: ");
        String endereco = leia.nextLine();

        System.out.print("Digite o data de nascimento: ");
        String dataNascimento = leia.nextLine();

        System.out.print("Digite o email: ");
        String email = leia.nextLine();

        System.out.print("Digite as Falas: ");
        String Fala = leia.nextLine();

        System.out.print("Digite a quantidade de Passos: ");
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

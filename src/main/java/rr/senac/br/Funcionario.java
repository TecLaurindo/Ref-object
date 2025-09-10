package rr.senac.br;

public class Funcionario extends People{
    public String cargo;
    public String matricula;
    public double salario;
    public String setor;

    public Funcionario(
                       String cargo,
                       String matricula,
                       double salario,
                       String setor,
                       String nome,
                       int idade,
                       String cpf,
                       String telefone,
                       String endereco,
                       String dataNascimento,
                       String email,
                       String Fala,
                       int Passo
                       ) {
        super(nome,idade,cpf,telefone,endereco,dataNascimento,email,Fala,Passo);
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
        this.setor = setor;

    }

    public String getCargo() {
        System.out.println("Cargo: ");
        return this.cargo = this.cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getSetor() {
        return this.setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
}



package rr.senac.br; // localização do pacote

public class Funcionario extends People{  //class funcionario + Herança de atributos da classe People
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
        this.salario = salario-500;
        this.setor = setor;

    }

    public String getCargo() {
        System.out.print("\nCargo: " + this.cargo);
        return this.cargo = this.cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        System.out.print("\nMatricula: " + this.matricula);
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        System.out.print("\nSalario: " + this.salario);
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getSetor() {
        System.out.print("\nSetor: " + this.setor);
        return this.setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
}



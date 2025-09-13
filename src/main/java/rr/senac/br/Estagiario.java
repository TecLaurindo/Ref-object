package rr.senac.br;                         //local pacote

public class Estagiario {                    //Class estagiario
    public String faculdade;
    public int periodo;
    public String instituicao;
    public boolean ativo;
    public double salario;

    public Estagiario(                       //Class construtor
            String faculdade,
            int periodo,
            String instituicao,
            boolean ativo,
            double salario)
    {
        this.faculdade = faculdade;
        this.periodo = periodo;
        this.instituicao = instituicao;
        this.ativo = ativo;
        this.salario = salario;
    }

    //getters e setters
    public String getFaculdade() {
        System.out.print("Faculdade: ");
        return faculdade;
    }
    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }
    public int getPeriodo() {
        System.out.print("Periodo: ");
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public String getInstituicao() {
        System.out.print("Instituicao: ");
        return instituicao;
    }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    public boolean isAtivo() {
        System.out.print("Ativo: ");
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public double getSalario() {
        System.out.print("Salario: ");
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}


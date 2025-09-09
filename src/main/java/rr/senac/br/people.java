package rr.senac.br;

public class people {
    public String nome;
    public int idade;
    private String cpf;
    
    public String getNome(){
        System.out.print("Seu nome é " + this.nome);
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        System.out.println("\ne a sua idade é " + this.idade );
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCpf(){
        System.out.print("\ne o seu CPF é esse " + this.cpf);
        return this.cpf;
    }
        public void setCpf(String cpf){
        this.cpf = cpf;
    
    }

}
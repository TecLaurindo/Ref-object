package rr.senac.br;

public class people {
    public String nome;
    public int idade;
    private String cpf;
    public String Fala;
    public int Passo;
    
    public String getNome(){
        System.out.print("Seu nome é " + this.nome);
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        System.out.print("\ne a sua idade é " + this.idade );
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

    public String getFala(){
        System.out.print("\nPowerRaner black piano argumentou " );
        return this.Fala;
    }

        public void setFala(String Fala){
            this.Fala = Fala;
    }

    public int getPasso(){
        System.out.print("\nPowerRanger deu " + this.Passo);
        return this.Passo;
    }
        public void setPasso(int Passo){
            this.Passo =  Passo;
        }

}
package rr.senac.br;

public class people {
    public String nome;
    public int idade;
    private String cpf;
    public String telefone;
    public String endereço;
    public String datanascimento;
    public String email;
    public String Fala;
    public int Passo;
    

    public String getNome(){
        System.out.print("NAME: " + this.nome);
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        System.out.print("\nIDADE: " + this.idade );
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCpf(){
        System.out.print("\nCPF: " + this.cpf);
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


    public String getEmail(){
        System.out.print("\nSeu email: " + this.email);
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getTelefone(){
        System.out.print("\nTELEFONE: " + this.telefone);
        return this.telefone;
    }
        public void setTelefone(String telefone){
            this.telefone = telefone;
        }
    
    public String getEndereço(){
        System.out.print("\nEndereço: " + this.endereço);
        return this.endereço;
    }
        public void setEndereço(String endereço){
            this.endereço = endereço;
        }

    public String getData(){
        System.out.print("\nData/Nascimento: " + this.datanascimento);
        return this.datanascimento;
    }
        public void setData(String datanascimento){
            this.datanascimento = datanascimento;
        }
}
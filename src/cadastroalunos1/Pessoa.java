
package cadastroalunos1;

public class Pessoa extends Endereco {
    private String nome;
    private String telefone;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String cpf, String nomeRua, String numeroCasa, String complemento, 
            String bairro, String cep) {
        super(nomeRua, numeroCasa, complemento, bairro, cep);
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}

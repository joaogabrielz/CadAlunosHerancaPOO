package cadastroalunos1;

import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {

    Scanner scan = new Scanner(System.in);

    private String matricula;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, String telefone, String cpf, String nomeRua, String numeroCasa,
            String complemento, String bairro, String cep) {
        super(nome, telefone, cpf, nomeRua, numeroCasa, complemento, bairro, cep);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void cadastroAlunos(List<Aluno> alunos) {

        System.out.println("Digite a matrícula do aluno: ");
        String matricula = scan.nextLine();
        System.out.println("Digite o nome do aluno");
        String nome = scan.nextLine();
        System.out.println("Digite o telefone");
        String telefone = scan.nextLine();
        System.out.println("Digite o CPF");
        String cpf = scan.nextLine();
        System.out.println("Digite o nome da rua");
        String nomeRua = scan.nextLine();
        System.out.println("Digite o número da casa");
        String numeroCasa = scan.nextLine();
        System.out.println("Digite o complemento");
        String complemento = scan.nextLine();
        System.out.println("Digite o bairro");
        String bairro = scan.nextLine();
        System.out.println("Digite o cep");
        String cep = scan.nextLine();

        Aluno aluno = new Aluno(matricula, nome, telefone, cpf, nomeRua, numeroCasa,
                complemento, bairro, cep);
        alunos.add(aluno);
    }

    public void listarAlunosCadastrados(List<Aluno> alunos) {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Matricula: " + alunos.get(i).getMatricula() + "; Nome : " + alunos.get(i).getNome()
                    + "; Telefone: " + alunos.get(i).getTelefone() + "; CPF: " + alunos.get(i).getCpf() + "; Rua: "
                    + alunos.get(i).getNomeRua() + "; Número da casa: " + alunos.get(i).getNumeroCasa()
                    + "; Complemento: " + alunos.get(i).getComplemento() + "; Bairro: " + alunos.get(i).getBairro());  
        }
    }

}

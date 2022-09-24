
package cadastroalunos1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAlunos1 {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        
        menuAlunos(alunos);
        
    }
    
    public static void menuAlunos( List<Aluno> alunos) {
        Scanner scan = new Scanner(System.in); 
        int opcao = 1;
        
        Aluno aluno = new Aluno();
        
        while (opcao != 0) {
            System.out.println(" ------- Menu Aluno ------- ");
            System.out.println("1. Cadastrar Alunos");
            System.out.println("2. Listar alunos cadastrados");
            System.out.println("0. Sair");
            
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 0:
                    System.out.println("Saindo.........");
                    break;

                case 1:
                    aluno.cadastroAlunos(alunos);
                    break;

                case 2:
                    aluno.listarAlunosCadastrados(alunos);
                    break;
                    
               default:
                    System.out.println("Opção inválida!");
            }  
        }        
    }
    
}

import java.util.Scanner;

import entidades.Aluno;
import entidades.Professor;
import model.AlunoModel;
import model.ProfessorModel;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AlunoModel am = new AlunoModel();
		ProfessorModel pm = new ProfessorModel();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();;
		boolean continuar = true;
		do {
			System.out.println("Digite");
			System.out.println("1. Cadastro de aluno\n 2. Listar alunos\n 3. Remover aluno");
			System.out.println("4. Cadastrar professor\n 5. Listar professore\n 6. Remover aluno");
			System.out.println("0. Sair.");
			int opc = scan.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Digite o nome:");
				aluno.setNome(scan.next());
				System.out.println("Digite a matrícula:");
				aluno.setMatricula(scan.nextInt());
				am.CadastrarAluno(aluno);
				break;
			case 2:
				System.out.println(am.ListarAlunos());
				break;
			case 3:
				System.out.println("Digite a matrícula:");
				am.RemoverAluno(scan.nextInt());
				break;
			case 4: 
				System.out.println("Digiite o nome:");
				professor.setNome(scan.next());
				System.out.println("Digite o ID:");
				professor.setId(scan.nextInt());
				pm.CadastrarProfessor(professor);
				break;
			case 5:
				System.out.println(pm.ListarProfessores());
				break;
			case 6:
				System.out.println("Digite o id:");
				pm.RemoverProfessor(scan.nextInt());
			break;
			case 0:
				continuar = false;
			break;
			}
			
		} while(continuar != false);	
		

	}

}

package model;

import java.util.ArrayList;
import java.util.List;

import entidades.Aluno;

public class AlunoModel {
	private List<Aluno> alunos = new ArrayList<>();
	
	public  void CadastrarAluno(Aluno aluno) {
		boolean existe = false; 
		for(int i = 0; i < alunos.size(); i++) {
			if(aluno.getMatricula() == alunos.get(i).getMatricula()) {
				existe = true;
			}
			if(existe == true) {
				System.out.println("Já existe em nosso registro.");
			} else {
				alunos.add(aluno);
				System.out.println("Cadastrado.");
			}
		}
		
	}
	
	public  String ListarAlunos() {
		String alunosLista = "";
		for(int i = 0; i < alunos.size(); i++) {
			alunosLista += alunos.get(i).getMatricula() + " | " + alunos.get(i).getNome() + "\n";
		}
		return alunosLista;
	}
	
	public void RemoverAluno(int matricula) {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getMatricula() == matricula) {
				alunos.remove(i);
				System.out.print("Removido.");
			} else {
				System.out.println("Erro ao remover.");
			}
		}
	}
	
}

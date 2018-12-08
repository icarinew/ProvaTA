package model;

import java.util.ArrayList;
import java.util.List;

import entidades.Professor;

public class ProfessorModel {
private List<Professor> professores = new ArrayList<>();
	
	public  void CadastrarProfessor(Professor professor) {
		boolean existe = false;
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getId() == professor.getId()) {
				existe = true;
			}
		}
		if(existe == true) {
			System.out.println("Essa matrícula já existe nos registros.");
		} else {
			professores.add(professor);
			System.out.println("Professor cadastrado com sucesso!");
		}
	}
	
	public String ListarProfessores() {
		String professoresLista = "";
		for(int i = 0; i < professores.size(); i++) {
			professoresLista += professores.get(i).getId() + " | " + professores.get(i).getNome() + "\n";
		}
		return professoresLista;
	}
	
	public  void RemoverProfessor(int id) {
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getId() == id) {
				professores.remove(i);
				System.out.print("Removido.");
			} else {
				System.out.println("Erro ao remover.");
			}
		}
	}
}

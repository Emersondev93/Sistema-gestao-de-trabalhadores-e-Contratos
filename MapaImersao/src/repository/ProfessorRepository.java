package repository;

import java.util.ArrayList;
import java.util.List;

import model.Professor;

public class ProfessorRepository {
	private List<Professor> professores = new ArrayList<>();
	
	public void adicionarProfessor(Professor professor) {
		professores.add(professor);
	}
	
	public List<Professor> listarTodos(){
		return professores;
	}

}

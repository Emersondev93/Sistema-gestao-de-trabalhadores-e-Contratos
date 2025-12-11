package repository;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoRepository {
	private List<Aluno> alunos = new ArrayList<>();
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public Aluno buscarPorMatricula(String matricula) {
		for(Aluno a : alunos) {
			if (a.getMatricula().equals(matricula)) {
				return a;
			}
		}
		return null;
	}

	public List<Aluno> listarTodos() {
		return alunos;
	}

}

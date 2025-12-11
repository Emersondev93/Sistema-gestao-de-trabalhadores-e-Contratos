package repository;

import java.util.ArrayList;
import java.util.List;

import model.Curso;

public class CursoRepository {
	private List<Curso> cursos = new ArrayList<>();
	
	public void adicionarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public List<Curso> listarTodos(){
		return cursos;
	}

}

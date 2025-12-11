package repository;

import java.util.ArrayList;
import java.util.List;

import model.Turma;

public class TurmaRepository {
	private List<Turma> turmas = new ArrayList<>();
	
	public void adicionarTurma(Turma turma) {
		turmas.add(turma);
	}
	public List<Turma> listarTodos(){
		return turmas;
	}
	
	public Turma buscarPorCodigo(String codigo) {
		for (Turma t : turmas) {
			if (t.getCodigoTurma().equals(codigo)) {
				return t;
			}
		}
		return null;
	}

}

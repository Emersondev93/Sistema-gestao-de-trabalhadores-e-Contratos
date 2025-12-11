package service;

import model.Aluno;
import model.Turma;
import repository.AlunoRepository;
import repository.TurmaRepository;

public class AcademicoService {
	private AlunoRepository alunoRepo;
	private TurmaRepository turmaRepo;
	
	public AcademicoService(AlunoRepository alunoRepo, TurmaRepository turmaRepo) {
		this.alunoRepo = alunoRepo;
		this.turmaRepo = turmaRepo;
	}
	
	public void matricularAlunoEmTurma(String matriculaAluno, String codigoTurma) {
		Aluno aluno = alunoRepo.buscarPorMatricula(matriculaAluno);
		Turma turma = turmaRepo.buscarPorCodigo(codigoTurma);
		
		if (aluno != null && turma != null) {
			turma.adicionarAluno(aluno);
			System.out.println("Aluno " + aluno.getNome() + "matriculado na turma" + turma.getCodigoTurma());
		}else {
			System.out.println("Erro: Aluno ou Turma não encontrados.");
		}
	}

}

package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String codigoTurma;
	private Curso curso;
	private Professor professor;
	private List<Aluno> alunos;

	public Turma(String codigoTurma, Curso curso, Professor professor) {
		super();
		this.codigoTurma = codigoTurma;
		this.curso = curso;
		this.professor = professor;
		this.alunos = new ArrayList<>();
	}

	public void adicionarAluno(Aluno aluno) {
		for (Aluno a : alunos) {
			if (a.getMatricula().equals(aluno.getMatricula())) {
				System.out.println("Aluno já está matriculado.");
			}
		}
		alunos.add(aluno);
		System.out.println("Aluno matriculado com sucesso.");
	}

	public void removerAluno(Aluno aluno) {
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getMatricula().equals(aluno.getMatricula())) {
				alunos.remove(i);
				System.out.println("Aluno removido com sucesso. ");
				return;
			}
		}
	}

	public void mostrarResumo() {
		System.out.println("-----Resumo da Turma-----" + codigoTurma + "---");
		System.out.println("Curso: "+ curso.getNome());
		System.out.println("Professor: "+ professor.getNome());
		System.out.println("Total de Alunos Matriculados: " + alunos.size());
		System.out.println("-----------------------------------------");

	}

	public String getCodigoTurma() {
		return codigoTurma;
	}

	public Curso getCurso() {
		return curso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public List<Aluno> getalunos() {
		return alunos;
	}


}

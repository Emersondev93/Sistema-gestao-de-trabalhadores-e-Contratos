package model;

import interfaces.Autenticacao;

public class Aluno extends Usuario implements Autenticacao{
	private String matricula;
	private String curso;

	public Aluno(String nome, String matricula, String curso, String login, String senha) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.login = login;
		this.senha = senha;
	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		return this.login.equals(login) && this.senha.equals(senha);
	}
	
	public void gerarRelatorio() {
		System.out.println("--- Relatório do Aluno ---");
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: "+ this.matricula);
		System.out.println("-----------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno Nome: " + nome + 
				"\nMatricula: " + matricula + 
				"\nCurso: " + curso ;
	}
	

}

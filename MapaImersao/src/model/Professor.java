package model;

import interfaces.Autenticacao;

public class Professor extends Usuario implements Autenticacao {
	private String especialidade;
	private String registro;

	public Professor(String nome, String especialidade, String registro, String login, String senha) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.registro = registro;
		this.login = login;
		this.senha = senha;
	}

	public void gerarRelatorio() {
		System.out.println("---Relatorio do Professor---");
		System.out.println("Nome: " + this.nome);
		System.out.println("Especialidade: " + this.especialidade);
		System.out.println("Registro: " + this.registro);
		System.out.println("----------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	@Override
	public String toString() {
		return "Professor Nome: " + nome + " \nEspecialidade: " + especialidade + " \nRegistro: " + registro;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		return this.login.equals(login) && this.senha.equals(senha);
	}

}

package model;

import interfaces.Autenticacao;

public class Administrador extends Usuario implements Autenticacao {
	private String cargo;
	
	public Administrador(String nome, String login, String senha, String cargo) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
	}
	@Override
	public boolean autenticar (String login, String senha) {
		return this.login.equals(login) && this.senha.equals(senha);
	}
	@Override
	public String toString() {
		return "Administrador Nome: "+ nome
				+ "\nCargo: " + cargo ;
	}
	
	
}

package model;

public class Curso {
	private String nome;
	private String codigo;
	private int cargaHoraria;

	public Curso(String nome, String codigo, int cargaHoraria) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}
	
	public void gerarRelatorio() {
		System.out.println("---Relatório do Curso---");
		System.out.println("Nome: " + this.nome);
		System.out.println("Código: " + this.codigo);
		System.out.println("Carga Horária: " + this.cargaHoraria);
		System.out.println("---------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso Nome: " + nome + "\nCodigo: " + codigo + "\nCargaHoraria: " + cargaHoraria;
	}

}

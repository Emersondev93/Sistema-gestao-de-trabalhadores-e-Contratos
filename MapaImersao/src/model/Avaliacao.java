package model;

public class Avaliacao {
	private double nota;
	private String descricao;
	private Aluno aluno;

	public Avaliacao(String descricao, Aluno aluno) {
		super();
		this.aluno = aluno;
		this.descricao = descricao;
	}

	public void atribuirNota(double valor) {

		if (valor < 0 || valor > 10) {
			System.out.println("Valor da nota inválido! ");
		} else {
			this.nota = valor;
			System.out.println("Nota: " + valor);
		}
		
	}

	public double getNota() {
		return nota;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	@Override
	public String toString() {
		return "Avaliacao: " + descricao + "\nAluno: " + aluno.getNome();
	}
	
	
}

package model;

public class cursoPresencial extends Curso {
	private String salaDeAula;

	public cursoPresencial(String nome, String codigo, int cargaHoraria, String salaDeAula) {
		super(nome, codigo, cargaHoraria);
		this.salaDeAula = salaDeAula;
		}
	public void detalharCurso() {
		System.out.println("Curso Presencial: " + getNome());
		System.out.println("Codigo do curso: " + getCodigo());
		System.out.println("Carga Horaria: " + getCargaHoraria());
		System.out.println("Sala: "+ this.salaDeAula);
	}
}

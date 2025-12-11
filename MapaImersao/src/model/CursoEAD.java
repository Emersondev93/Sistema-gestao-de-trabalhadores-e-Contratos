package model;

public class CursoEAD extends Curso{
	private String plataformaVirtual;
	
	public CursoEAD(String nome, String codigo, int cargaHoraria, String plataformaVirtual) {
		super(nome, codigo, cargaHoraria);
		this.plataformaVirtual = plataformaVirtual;
	}
	public void detalharCurso(){
		System.out.println("CursoEAD: " + getNome());
		System.out.println("Código: " + getCodigo());
		System.out.println("Carga Horária: " + getCargaHoraria());
		System.out.println("Plataforma Virtual: " + this.plataformaVirtual);
	}
	

}

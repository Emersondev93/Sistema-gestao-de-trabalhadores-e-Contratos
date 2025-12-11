//package model;
//
//public class Teste {
//
//	public static void main(String[] args) {
//		Aluno a1 = new Aluno("Emerson", "253521", "Analise e D. Sistemas");
//		Professor p1 = new Professor("Marcos", "POO", "REG987");
//		Curso c1 = new Curso("Analise e d. Sistemas", "ADS", 3000);
//		
//		System.out.println(a1);
//		System.out.println("------------------------------");
//		System.out.println(p1);
//		System.out.println("------------------------------");
//		System.out.println(c1);
//		
//		Turma t1 = new Turma("turma01", c1, p1);
//		t1.adicionarAluno(a1);
//		t1.mostrarResumo();
//		
//		Avaliacao av1 = new Avaliacao(a1, "Prova de POO");
//		
//		System.out.println(av1);
//		av1.atribuirNota(8.5);
//		cursoPresencial cp1 = new cursoPresencial(c1.getNome(),c1.getCodigo(),c1.getCargaHoraria(), "3");
//		System.out.println("--------------------------------");
//		cp1.destalharCurso();
//	}
//
//}

package ui;

import java.util.Scanner;

import model.Aluno;
import model.Avaliacao;
import model.Curso;
import model.CursoEAD;
import model.Professor;
import model.Turma;
import model.cursoPresencial;
import repository.AlunoRepository;
import repository.CursoRepository;
import repository.ProfessorRepository;
import repository.TurmaRepository;
import service.AcademicoService;

public class MainUI {
	// Instancias dos repositórios
	private static AlunoRepository alunoRepository = new AlunoRepository();
	private static ProfessorRepository professorRepository = new ProfessorRepository();
	private static CursoRepository cursoRepository = new CursoRepository();
	private static TurmaRepository turmaRepository = new TurmaRepository();
	private static AcademicoService academicoService = new AcademicoService(alunoRepository, turmaRepository);

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Dados iniciais para teste
		alunoRepository.adicionarAluno(new Aluno("Alice Silva", "111", "ESof", "alice_login", "123"));
		professorRepository.adicionarProfessor(new Professor("Marcos", "POO", "P1", "marcos_login", "1234"));
		cursoRepository.adicionarCurso(new cursoPresencial("Eng.Software ", "C1", 60, "B22"));

		int opcao = 0;
		while (opcao != 9) {
			System.out.println("\n --- Menu Principal EduConect ---");
			System.out.println("1. Cadastrar Aluno");
			System.out.println("2. Cadastrar Professor");
			System.out.println("3. Cadastrar Curso");
			System.out.println("4. Criar Turma");
			System.out.println("5. Matricular Aluno em Turma");
			System.out.println("6. Registrar Avaliação");
			System.out.println("7. Gerar relatorios gerais");
			System.out.println("9.Sair");
			System.out.println("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				cadastrarAluno();
				break;
			case 2:
				cadastrarProfessor();
				break;

			case 3:
				cadastrarCurso();
				break;

			case 4:
				criarTurma();
				break;
			case 5:
				matricularAlunoEmTurma();
				break;
			case 6:
				registrarAvaliacaoExemplo();
				break;
			case 7:
				gerarRelatoriosGerais();
				break;
			case 9:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção Inválida.");
			}
		}
	}

	private static void cadastrarAluno() {
		System.out.println("Nome do aluno: ");
		String nome = sc.nextLine();
		System.out.println("Matricula: ");
		String matricula = sc.nextLine();
		System.out.println("Curso Inicial: ");
		String curso = sc.nextLine();
		System.out.println("Login: ");
		String login = sc.nextLine();
		System.out.println("Senha: ");
		String senha = sc.nextLine();

		Aluno novoAluno = new Aluno(nome, matricula, curso, login, senha);
		alunoRepository.adicionarAluno(novoAluno);
		System.out.println("Aluno cadastrado com sucesso!");
	}

	private static void cadastrarProfessor() {
		System.out.println("Nome do Professor: ");
		String nome = sc.nextLine();
		System.out.println("Especialidade: ");
		String especialidade = sc.nextLine();
		System.out.println("Registro: ");
		String registro = sc.nextLine();
		System.out.println("Login: ");
		String login = sc.nextLine();
		System.out.println("Senha: ");
		String senha = sc.nextLine();

		Professor novoProfessor = new Professor(nome, especialidade, registro, login, senha);
		professorRepository.adicionarProfessor(novoProfessor);
		System.out.println("Professor cadastrado com sucesso!");
	}

	private static void cadastrarCurso() {
		System.out.println("Nome do Curso: ");
		String nome = sc.nextLine();
		System.out.println("Código: ");
		String codigo = sc.nextLine();
		System.out.println("Carga Horária: ");
		int cargaHoraria = sc.nextInt();
		sc.nextLine();
		System.out.println("Tipo (P - Presencial, E - EAD): ");
		String tipo = sc.nextLine();

		if (tipo.equalsIgnoreCase("P")) {
			System.out.println("Sala de Aula: ");
			String sala = sc.nextLine();
			cursoRepository.adicionarCurso(new cursoPresencial(nome, codigo, cargaHoraria, sala));
		} else if (tipo.equalsIgnoreCase("E")) {
			System.out.println("Plataforma Virtual: ");
			String plataforma = sc.nextLine();
			cursoRepository.adicionarCurso(new CursoEAD(nome, codigo, cargaHoraria, plataforma));
		} else {
			System.out.println("Tipo inválido. Cadastrando curso genérico.");
			cursoRepository.adicionarCurso(new Curso(nome, codigo, cargaHoraria));
		}
		System.out.println("Curso cadastrado com sucesso! ");
	}

	private static void criarTurma() {
		System.out.println("Código da Turma: ");
		String codigo = sc.nextLine();
		System.out.println("Professores disponíveis: " + professorRepository.listarTodos());
		System.out.println("Registro do Professor ");
		String regProf = sc.nextLine();
		Professor prof = professorRepository.listarTodos().stream().filter(p -> p.getRegistro().equals(regProf))
				.findFirst().orElse(null);

		System.out.println("Cursos disponíveis: " + cursoRepository.listarTodos());
		System.out.print("Código do Curso: ");
		String codCurso = sc.nextLine();
		Curso curso = cursoRepository.listarTodos().stream().filter(c -> c.getCodigo().equals(codCurso)).findFirst()
				.orElse(null);

		if (prof != null && curso != null) {
			Turma novaTurma = new Turma(codigo, curso, prof);
			turmaRepository.adicionarTurma(novaTurma);
			System.out.println("Turma criada com sucesso! ");
		} else {
			System.out.println("Erro ao criar turma: Professor ou Curso não encontrados");
		}

	}

	private static void matricularAlunoEmTurma() {
		System.out.println("Alunos disponíveis: " + alunoRepository.listarTodos());
		System.out.print("Matrícula do Aluno: ");
		String matAluno = sc.nextLine();
		System.out.println("Turmas disponíveis: " + turmaRepository.listarTodos());
		System.out.println("Código da Turma: ");
		String codTurma = sc.nextLine();

		academicoService.matricularAlunoEmTurma(matAluno, codTurma);
	}

	private static void registrarAvaliacaoExemplo() {
		if (alunoRepository.listarTodos().isEmpty()) {
			System.out.println("Cadastre um aluno primeiro. ");
			return;
		}
		Aluno aluno = alunoRepository.listarTodos().get(0);
		Avaliacao aval = new Avaliacao("Prova de POO", aluno);

		System.out.println("\nTentando atribuir nota 15: ");
		aval.atribuirNota(15.0);

		System.out.println("Tentando atribuir nota 8.5: ");
		aval.atribuirNota(8.5);
		System.out.println(aval);
	}

	private static void gerarRelatoriosGerais() {
		System.out.println("\n--- Gerando Relatorios ---");

		System.out.println("\nRelatorios de Alunos: ");
		for (Aluno a : alunoRepository.listarTodos()) {
			a.gerarRelatorio();
		}

		System.out.println("\nRelatórios de Professores: ");
		for (Professor p : professorRepository.listarTodos()) {
			p.gerarRelatorio();
		}

		System.out.println("\nRelatórios de Cursos ");
		for (Curso c : cursoRepository.listarTodos()) {
			// Chamando detalharCurso que foi sobrescrito nas subclasses
			if (c instanceof cursoPresencial) {
				((cursoPresencial) c).detalharCurso();
			} else if (c instanceof CursoEAD) {
				((CursoEAD) c).detalharCurso();
			} else {
				c.gerarRelatorio();
			}
		}
	}
}

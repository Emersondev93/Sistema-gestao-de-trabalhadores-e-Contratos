package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidadesEnum.NivelTrabalhador;

public class Principal {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String nomeDpto = sc.nextLine();

		System.out.println("Dados do trabalhador: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Nível: ");
		String nivel = sc.nextLine();

		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel.toUpperCase()), salarioBase,
				new Departamento(nomeDpto));
		System.out.println();
		System.out.print("Digite o número de contratos do trabalhador:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados do contrato #" + (i + 1) + ":");
			System.out.println("Data: (DD/MM/YYYY)");
			LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);

			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();

			System.out.println("Duração: ");
			int horas = sc.nextInt();
			sc.nextLine();

			HoraContrato contrato = new HoraContrato(dataContrato, valorPorHora, horas);

			trabalhador.adicionarContrato(contrato);

		}

		System.out.print("Digite o mes e o ano para calcular a renda (MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println(trabalhador.renda(ano, mes));

		sc.close();
	}

}

package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidadesEnum.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private double salarioBase;
	List<HoraContrato> contratos = new ArrayList<>();
	private Departamento departamento;

	public Trabalhador() {

	}

	public Trabalhador(String nome, NivelTrabalhador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void adicionarContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public double renda(int ano, int mes) {
		double soma = salarioBase;

		for (HoraContrato c : contratos) {
			int c_ano = c.getData().getYear();
			int c_mes = c.getData().getMonthValue();

			if (c_ano == ano && c_mes == mes) {
				soma += c.valorTotal();
			}
		}
		return soma;

	}

}

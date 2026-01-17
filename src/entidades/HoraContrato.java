package entidades;

import java.time.LocalDate;

public class HoraContrato {
	private LocalDate data;
	private double valorPorHora;
	private Integer horas;

	public HoraContrato() {

	}

	public HoraContrato(LocalDate data, double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHora() {
		return horas;
	}

	public void setHora(Integer hora) {
		this.horas = hora;
	}

	public double valorTotal() {
		return valorPorHora * horas;
	}

}

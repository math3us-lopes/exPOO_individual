package br.com.aulapoo.ZexercicioExtra;

public class Veiculoo {
	private String chassi;
	private String placa;
	private String cor;
	private double ipva;
	private String tipo;
	
	
	public Veiculoo(String chassi, String placa, String cor, double ipva, String tipo) {
		super();
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.ipva = ipva;
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Veiculoo(String chassi, String placa, String cor, double ipva) {
		super();
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.ipva = ipva;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getIpva() {
		return ipva;
	}
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	
	
}

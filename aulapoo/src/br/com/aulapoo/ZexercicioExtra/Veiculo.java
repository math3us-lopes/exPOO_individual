package br.com.aulapoo.ZexercicioExtra;

public class Veiculo  {
	String placa;
	String tipo;
	double valor;

	public String getPlaca() {
		return placa;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veiculo(String placa, String tipo, double valor) {
		super();
		this.placa = placa;
		this.tipo = tipo;
		this.valor = valor;
	}

	public double CalculaIPVA() {
		if (tipo.equals("flex") || tipo.contentEquals("Gasolina")) {
			return valor * 0.04;
		} else {
			return valor * 0.015;
		}
	}
}

package br.com.aulapoo.ZexercicioExtra;

public class Mercearia {
	private String descricacao;
	private double valor;
	private int qtd;

	public Mercearia(String descricacao, double valor, int qtd) {
		this.descricacao = descricacao;
		this.valor = valor;
		this.qtd = qtd;
	}

	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double calcularIcms() {
		double total = valor * qtd;
		return total * 0.02;
	}

	public double valorFinal() {
		return valor * qtd;
	}
}

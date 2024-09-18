package br.com.aulapoo.ZexercicioExtra;

public class Produto {
	private String descricao;
	private double valor;
	private int quantidade;
	public Produto(String descricao, double valor, int quantidade) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double  calcularIcms() {
		double total = valor *quantidade;
		return total * 0.12;
	}
	public double calculoTotal() {
		return valor * quantidade;
	}
}

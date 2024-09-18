package br.com.aulapoo.ZexercicioExtra;

public class Imovel {
	protected String local;
	private double valorImovel;
	public Imovel(String local, double valorImovel) {
		super();
		this.local = local;
		this.valorImovel = valorImovel;
	}
	@Override
	public String toString() {
		return "Imovel [local=" + local + ", valorImovel=" + valorImovel + "]";
	}
	
   public double calcularImpostto() {
	   return valorImovel * 3.5/100;
   }
}

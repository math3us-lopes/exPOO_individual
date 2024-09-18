package br.com.aulapoo.ZexercicioExtra;

public class Apto  extends Imovel{
	
	private int andar;

	public Apto(String local, double valorImovel, int andar) {
		super(local, valorImovel);
		this.andar = andar;
	}

	@Override
	public String toString() {
		return "Apto [andar=" + andar + "]";
	}

	public int getAndar() {
		return andar;
	}
	
	

}

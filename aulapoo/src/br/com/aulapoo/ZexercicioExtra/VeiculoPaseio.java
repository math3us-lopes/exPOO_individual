package br.com.aulapoo.ZexercicioExtra;

public class VeiculoPaseio extends Veiculoo{
	public VeiculoPaseio(String chassi, String placa, String cor, double ipva, String tipo, int quantidadePortas) {
		super(chassi, placa, cor, ipva, tipo);
		this.quantidadePortas = quantidadePortas;
	}

	private int quantidadePortas;

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	

}

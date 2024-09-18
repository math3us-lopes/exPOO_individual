package br.com.aulapoo.ZexercicioExtra;

public class Pessoa {
	private int idPessoa;
	private String nome;
	private double peso;
	private double altura;

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public double CalcularImc() {
		double imc = peso / (altura * altura);
		System.out.print(imc);
		return imc;
	}

	public String resultado() {
		String situacao;
		if (CalcularImc() < 18.5) {
			return situacao = "Abaixo do peso";
		} else {
			if (CalcularImc() >= 18.5 && CalcularImc() <= 24.9) {
				return situacao = "Peso normal";

			} else {
				return situacao = "Você está acima do peso.";
			}
		}
	}

	public Pessoa(int idPessoa, String nome, double peso, double altura) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

}

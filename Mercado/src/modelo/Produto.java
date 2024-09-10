package modelo;

import utils.Utils;

public class Produto {
	private static int count =1;
	
	private int id;
	private String nome;
	private double preco;

	private double value;
	
	
	public Produto(String nome, double preco) {
		this.id=count;
		this.nome = nome;
		this.preco = preco;
		Produto.count+=1;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getId() {
		return id;
	}


	
	public String toString() {
		return  "id: " + this.getId()+"\nnome: " + this.getNome()
		+"\npreço: "+ Utils.doubleToString(this.getPreco());
	}
	
}

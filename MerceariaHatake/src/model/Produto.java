package model;

import java.util.Objects;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(int id, String nome, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	// toString para exibição
	@Override
	public String toString() {
		return "Produto [ID=" + id + ", Nome=" + nome + ", Preço=" + preco + ", Quantidade=" + quantidade + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Produto produto = (Produto) o;
		return id == produto.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

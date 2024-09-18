package model;

import java.util.Objects;

public class Cliente {
	private int id;
	private String nome;
	private String endereco;
	private String telefone;
	private int produtoId; // Chave estrangeira referenciando Produto

	public Cliente(int id, String nome, String endereco, String telefone, int produtoId) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.produtoId = produtoId;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public int getProdutoId() {
		return produtoId;
	}

	// toString para exibição
	@Override
	public String toString() {
		return "Cliente [ID=" + id + ", Nome=" + nome + ", Endereço=" + endereco + ", Telefone=" + telefone
				+ ", ProdutoID=" + produtoId + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Cliente cliente = (Cliente) o;
		return id == cliente.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

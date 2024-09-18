// src/Venda.java
package model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Venda {
	private int id;
	private int clienteId;
	private int produtoId;
	private int quantidade;
	private String data;

	public Venda(int id, int clienteId, int produtoId, int quantidade, String data) {
		this.id = id;
		this.clienteId = clienteId;
		this.produtoId = produtoId;
		this.quantidade = quantidade;
		this.data = data;
	}

	// Getters
	public int getId() {
		return id;
	}

	public int getClienteId() {
		return clienteId;
	}

	public int getProdutoId() {
		return produtoId;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getData() {
		return data;
	}

	// toString para exibição
	@Override
	public String toString() {
		return "Venda [ID=" + id + ", ClienteID=" + clienteId + ", ProdutoID=" + produtoId + ", Quantidade="
				+ quantidade + ", Data=" + data + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Venda venda = (Venda) o;
		return id == venda.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// Método para obter a data atual formatada
	public static String obterDataAtual() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return LocalDateTime.now().format(formatter);
	}
}

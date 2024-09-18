package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import model.Cliente;
import model.Produto;
import model.Venda;

public class Relatorio {
	private static final Logger logger = Logger.getLogger(Relatorio.class.getName());

	// Gera relatório de produtos na tela
	public static void gerarRelatorioProdutosTela(List<Produto> produtos) {
		System.out.println("=== Relatório de Produtos ===");
		for (Produto p : produtos) {
			System.out.println(p);
		}
		logger.info("Relatório de produtos exibido na tela.");
	}

	// Gera relatório de clientes na tela
	public static void gerarRelatorioClientesTela(List<Cliente> clientes) {
		System.out.println("=== Relatório de Clientes ===");
		for (Cliente c : clientes) {
			System.out.println(c);
		}
		logger.info("Relatório de clientes exibido na tela.");
	}

	// Gera relatório de vendas na tela
	public static void gerarRelatorioVendasTela(List<Venda> vendas) {
		System.out.println("=== Relatório de Vendas ===");
		for (Venda v : vendas) {
			System.out.println(v);
		}
		logger.info("Relatório de vendas exibido na tela.");
	}

	// Gera relatório de produtos em arquivo
	public static void gerarRelatorioProdutosArquivo(List<Produto> produtos, String caminhoArquivo) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
			writer.write("=== Relatório de Produtos ===\n");
			for (Produto p : produtos) {
				writer.write(p.toString() + "\n");
			}
			logger.info("Relatório de produtos gerado no arquivo: " + caminhoArquivo);
			System.out.println("Relatório de produtos gerado com sucesso em " + caminhoArquivo);
		} catch (IOException e) {
			logger.severe("Erro ao gerar relatório de produtos: " + e.getMessage());
			System.out.println("Erro ao gerar relatório de produtos.");
		}
	}

	// Gera relatório de clientes em arquivo
	public static void gerarRelatorioClientesArquivo(List<Cliente> clientes, String caminhoArquivo) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
			writer.write("=== Relatório de Clientes ===\n");
			for (Cliente c : clientes) {
				writer.write(c.toString() + "\n");
			}
			logger.info("Relatório de clientes gerado no arquivo: " + caminhoArquivo);
			System.out.println("Relatório de clientes gerado com sucesso em " + caminhoArquivo);
		} catch (IOException e) {
			logger.severe("Erro ao gerar relatório de clientes: " + e.getMessage());
			System.out.println("Erro ao gerar relatório de clientes.");
		}
	}

	// Gera relatório de vendas em arquivo
	public static void gerarRelatorioVendasArquivo(List<Venda> vendas, String caminhoArquivo) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
			writer.write("=== Relatório de Vendas ===\n");
			for (Venda v : vendas) {
				writer.write(v.toString() + "\n");
			}
			logger.info("Relatório de vendas gerado no arquivo: " + caminhoArquivo);
			System.out.println("Relatório de vendas gerado com sucesso em " + caminhoArquivo);
		} catch (IOException e) {
			logger.severe("Erro ao gerar relatório de vendas: " + e.getMessage());
			System.out.println("Erro ao gerar relatório de vendas.");
		}
	}
}

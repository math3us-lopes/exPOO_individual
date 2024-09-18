package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import jdk.jshell.execution.Util;
import modelo.Produto;
import utils.Utils;

public class Mercado {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;
	private static Logger log = Logger.getLogger(Mercado.class.getName());
	public static void main(String[] args) {
		produtos = new ArrayList<>();
		carrinho = new HashMap<>();
		menu();
	}

	private static void menu() {
		 log.info("------------------------------------------------");
		 log.info("--------- Welcome to MTS Market Music ------------");
		 log.info("------------------------------------------------");
		 log.info("*** Selecione uma operação que deseja realizar ***");
		 log.info("------------------------------------------------");
		 log.info("|  Opção 1 - Cadastrar    |");
		 log.info("|  Opção 2 - Listar       |");
		 log.info("|  Opção 3 - Comprar      |");
		 log.info("|  Opção 4 - Carrinho     |");
		 log.info("|  Opção 5 - Sair         |");

		int opcao = input.nextInt();
		switch (opcao) {
		case 1:
			cadastrarProdutos();
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			comprarProdutos();
			break;
		case 4:
			verCarrinho();
			break;
		case 5:
			log.warning("Volte sempre!");
			System.exit(0);
			break;
		default:
			log.severe("Opção inválida!");
			menu();
			break;
		}
	}

	private static void cadastrarProdutos() {
		log.info("Nome do Produto: ");
		String nome = input.next();

		log.info("Preço do Produto: ");
		Double preco = input.nextDouble();

		Produto produto = new Produto(nome, preco);
		produtos.add(produto);

		log.warning(produto.getNome() + " cadastrado com sucesso!");
		menu();
	}

	private static void listarProdutos() {
		if (produtos.size() > 0) {
			log.warning("Lista de produtos!\n");

			for (Produto p : produtos) {
				System.out.println(p);
			}
		} else {
			log.warning("Nenhum produto cadastrado!");
		}
		menu();
	}

	private static void comprarProdutos() {
		if (produtos.size() > 0) {
			log.info("Código do Produto: \n");
			log.info("------------- Produtos Disponíveis -----------");
			for (Produto p : produtos) {
				System.out.println(p + "\n");
			}

			int id = Integer.parseInt(input.next());
			boolean isPresent = false;

			for (Produto p : produtos) {
				if (p.getId() == id) {
					int qtd = 0;
					try {
						qtd = carrinho.get(p);
						// Se o produto já estiver no carrinho, incrementa a quantidade
						carrinho.put(p, qtd + 1);
					} catch (NullPointerException e) {
						// Se for o primeiro produto no carrinho
						carrinho.put(p, 1);
					}

					System.out.println(p.getNome() + " adicionado ao carrinho.");
					isPresent = true;

					if (isPresent) {
						log.info("Deseja adicionar outro produto ao carrinho?");
						log.info("Digite 1 para sim, ou 0 para finalizar a compra.");
						int opcao = Integer.parseInt(input.next());

						if (opcao == 1) {
							comprarProdutos();
						} else {
							finalizarCompra();
						}
					}
					break;
				}
			}

			if (!isPresent) {
				log.warning("Produto não encontrado.");
				menu();
			}
		} else {
			log.warning("Não existe produto cadastrado!");
			menu();
		}
	}

	private static void verCarrinho() {
		System.out.println("---- Produtos no seu Carrinho ----");
		if (carrinho.size() > 0) {
			for (Produto p : carrinho.keySet()) {
				log.info("Produto: " + p + "\nQuantidade: " + carrinho.get(p));
			}
		} else {
			log.warning("Carrinho Vazio!");
		}
		menu();
	}

	private static void finalizarCompra() {
		Double valorDaCompra = 0.0;
		System.out.println("Seus produtos!");

		for (Produto p : carrinho.keySet()) {
			int qtd = carrinho.get(p);
			valorDaCompra += p.getPreco() * qtd;
			System.out.println(p);
			System.out.println("Quantidade: " + qtd);
			System.out.println("---------------------");
		}
		System.out.println("Valor da compra: " + Utils.doubleToString(valorDaCompra));
		carrinho.clear();
		System.out.println("Obrigado pela preferência!");
		menu();
	}
}

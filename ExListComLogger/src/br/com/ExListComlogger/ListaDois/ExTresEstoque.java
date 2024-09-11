package br.com.ExListComlogger.ListaDois;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExTresEstoque {
	static Logger log = Logger.getLogger(ExTresEstoque.class.getName());
	static final int TAMANHO = 3;
	static String[][] produtos = { { "Pedais de Guitarra", "5" }, { "Contra Baixo JazzBass", "0" },
			{ " Kit Pratos de Bateria", "3" } };
	static String[] listarProdutosComEstoque = new String[TAMANHO];
	static String[] listarProdutosSemEstoque = new String[TAMANHO];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

		// Exibe o menu para o usuário
		log.info("Escolha uma das opções abaixo:");
		log.info("[1] Listar produtos com estoque");
		log.info("[2] Listar produtos sem estoque");
		log.info("[3] Sair");
		log.info("Opção escolhida: ");
		opcao = sc.nextInt();

		// Realiza a ação baseada na opção escolhida
		switch (opcao) {
		case 1:
			log.info("Lista de produtos com estoque:");
			consultar();
			imprimir(opcao);
			break;
		case 2:
			log.info("Lista de produtos sem estoque:");
			consultar();
			imprimir(opcao);
			break;
		case 3:
			menuRetorno(sc);
			break;
		default:
			log.severe("Opção inválida! Tente novamente.");
			aguardar();
			main(args); // Chama o menu novamente em caso de erro
			break;
		}

		sc.close();
	}

	// Método para confirmar a saída do programa
	public static void menuRetorno(Scanner sc) {
		int opcao;
		log.warning("Deseja realmente sair?");
		log.info("[1] Sim");
		log.info("[2] Não");
		log.info("Opção escolhida: ");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			log.warning("Até logo!");
			break;
		case 2:
			aguardar();
			main(null); // Volta para o menu principal
			break;
		default:
			log.severe("Opção inválida! Tente novamente.");
			aguardar();
			menuRetorno(sc);
			break;
		}
	}

	// Método para imprimir produtos com ou sem estoque
	public static void imprimir(int opcao) {
		for (int i = 0; i < TAMANHO; i++) {
			if (opcao == 1 && !listarProdutosComEstoque[i].equals("x")) {
				log.info("- " + listarProdutosComEstoque[i]);
			} else if (opcao == 2 && !listarProdutosSemEstoque[i].equals("x")) {
				log.info("- " + listarProdutosSemEstoque[i]);
			}
		}
	}

	// Consulta para classificar produtos com ou sem estoque
	public static void consultar() {
		int g = 0, f = 0;

		for (int i = 0; i < produtos.length; i++) {
			int quantidade = Integer.parseInt(produtos[i][1]);

			if (quantidade > 0) {
				listarProdutosComEstoque[g] = produtos[i][0];
				g++;
			} else {
				listarProdutosSemEstoque[f] = produtos[i][0];
				f++;
			}
		}

		for (int i = 0; i < TAMANHO; i++) {
			if (i >= g) {
				listarProdutosComEstoque[i] = "x";
			}
			if (i >= f) {
				listarProdutosSemEstoque[i] = "x";
			}
		}
	}

	// Simula uma pausa
	public static void aguardar() {
		try {
			System.out.print("\nAguarde");
			for (int i = 0; i < 3; i++) {
				Thread.sleep(1000);
				System.out.print(".");
			}
			System.out.println();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

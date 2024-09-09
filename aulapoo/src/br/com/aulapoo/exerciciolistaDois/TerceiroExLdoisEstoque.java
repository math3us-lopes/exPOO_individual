package br.com.aulapoo.exerciciolistaDois;

import java.util.Scanner;

public class TerceiroExLdoisEstoque {

	static final int TAMANHO = 3;
	static String[][] produtos = { { "Pedais de Guitarra", "5" }, { "Contra Baixo JazzBass", "0" },
			{ " Kit Pratos de Bateria", "3" } };
	static String[] listarProdutosComEstoque = new String[TAMANHO];
	static String[] listarProdutosSemEstoque = new String[TAMANHO];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

		// Exibe o menu para o usuário
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("[1] Listar produtos com estoque");
		System.out.println("[2] Listar produtos sem estoque");
		System.out.println("[3] Sair");
		System.out.print("Opção escolhida: ");
		opcao = sc.nextInt();

		// Realiza a ação baseada na opção escolhida
		switch (opcao) {
		case 1:
			System.out.println("Lista de produtos com estoque:");
			consultar();
			imprimir(opcao);
			break;
		case 2:
			System.out.println("Lista de produtos sem estoque:");
			consultar();
			imprimir(opcao);
			break;
		case 3:
			menuRetorno(sc);
			break;
		default:
			System.out.println("Opção inválida! Tente novamente.");
			aguardar();
			main(args); // Chama o menu novamente em caso de erro
			break;
		}

		sc.close();
	}

	// Método para confirmar a saída do programa
	public static void menuRetorno(Scanner sc) {
		int opcao;
		System.out.println("Deseja realmente sair?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		System.out.print("Opção escolhida: ");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Até logo!");
			break;
		case 2:
			aguardar();
			main(null); // Volta para o menu principal
			break;
		default:
			System.out.println("Opção inválida! Tente novamente.");
			aguardar();
			menuRetorno(sc);
			break;
		}
	}

	// Método para imprimir produtos com ou sem estoque
	public static void imprimir(int opcao) {
		for (int i = 0; i < TAMANHO; i++) {
			if (opcao == 1 && !listarProdutosComEstoque[i].equals("x")) {
				System.out.println("- " + listarProdutosComEstoque[i]);
			} else if (opcao == 2 && !listarProdutosSemEstoque[i].equals("x")) {
				System.out.println("- " + listarProdutosSemEstoque[i]);
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

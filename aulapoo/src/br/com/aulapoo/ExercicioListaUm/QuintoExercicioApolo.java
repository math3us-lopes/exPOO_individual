package br.com.aulapoo.ExercicioListaUm;

import java.util.Scanner;

public class QuintoExercicioApolo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

		System.out.println("Escolha uma das questões abaixo para responder em 5 segundos:");
		System.out.println("\nExpressão 1) (2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66)");
		System.out.println("\nExpressão 2) (2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9)");
		System.out.println("\n");
		opcao = sc.nextInt();

		// Contador de 5 segundos
		for (int contador = 5; contador >= 0; contador--) {
			System.out.print("\r" + contador);
			aguardar(1000); // Aguarda 1 segundo
		}
		System.out.println(); // Nova linha após o contador

		// Processa a opção escolhida
		switch (opcao) {
		case 1:
			System.out.println("\n\nResposta correta:");
			System.out.println(2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66);
			break;

		case 2:
			System.out.println("\n\nResposta correta:");
			System.out.println(2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9);
			break;

		default:
			System.out.println("Opção inválida. Obrigado!");
			break;
		}

		sc.close();
	}

	// Método para aguardar um determinado tempo
	public static void aguardar(int milissegundos) {
		try {
			Thread.sleep(milissegundos);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

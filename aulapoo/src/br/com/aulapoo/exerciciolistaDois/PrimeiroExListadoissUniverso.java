package br.com.aulapoo.exerciciolistaDois;

import java.util.Scanner;

public class PrimeiroExListadoissUniverso {

	public static void main(String[] args) {
		PrimeiroExListadoissUniverso p = new PrimeiroExListadoissUniverso();
		p.mostrarMenu(); // Chama o método para exibir o menu inicial
	}

	public void mostrarMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==========Guia=Mochileiro=das=Gálaxias===================");
		System.out.println("---------------------------------------------------------");
		System.out.println("----------1 para exibir mensagem-------------------------");
		System.out.println("----------2 para a resposta------------------------------");
		System.out.println("----------3 para conhecer um breve Resumo do livro  ---- ");
		System.out.println("----------4 explicando o porque do número--------------- ");
		System.out.println("----------0 para sair------------------------------------");
		System.out.println("=========================================================");
		int universo = sc.nextInt();

		switch (universo) {
		case 0:
			System.out.println("Muito obrigado por nos visitar!\nO Universo agradece, volte sempre.");
			return; // Encerra o programa
		case 1:
			System.out.println("De acordo com o livro o guia do mochileiro das galáxias, qual é o número do Universo?");
			returnParaMenu(); // Volta ao menu após a execução
			break;
		case 2:
			System.out.println("Resposta : O número do Universo é 42");
			returnParaMenu(); // Volta ao menu após a execução
			break;
		case 3:
			System.out.println(
					"Na saga “O Guia do Mochileiro das Galáxias,” os Magratheans, especialistas em construir planetas sob encomenda,\n"
							+ "foram contratados para criar o supercomputador Pensamento Profundo.\n"
							+ "Seu objetivo era decifrar a “Pergunta Fundamental da Vida, do Universo e de Tudo” para uma superinteligência curiosa.\n"
							+ "O processo de construção do Pensamento Profundo levou muitos anos, resultando em um computador colossal.\n"
							+ "Após sua ativação, e um tempo de processamento de milhões de anos, o supercomputador revelou a resposta enigmática de 42.");
			returnParaMenu(); // Volta ao menu após a execução
			break;
		case 4:
			System.out.println(
					"O número 42 tornou-se icônico na cultura pop como a resposta definitiva e sem sentido para a vida, o universo e tudo mais.\n"
							+ "A escolha do número 42 por Douglas Adams foi, segundo o autor, uma piada arbitrária sem um significado real.\n"
							+ "No entanto, isso apenas aumentou o mistério e o fascínio em torno do número.");
			returnParaMenu(); // Volta ao menu após a execução
			break;
		default:
			System.out.println("Número inexistente!");
			returnParaMenu(); // Volta ao menu após uma entrada inválida
			break;
		}

		sc.close(); // Fecha o scanner após a execução
	}

	public void returnParaMenu() {
		mostrarMenu(); // Volta ao menu inicial chamando o método novamente
	}
}
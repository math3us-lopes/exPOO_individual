package br.com.aulapoo.ZexercicioExtra;

import java.util.Scanner;

public class ExercicioWelcome {
	public static void main(String[] args) {
		monstrarMenu();
	}

	public static void monstrarMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t============Menu======================");
		System.out.println(" \tEscolha uma opcão!");
		System.out.println("\t---------------------------------------");
		System.out.println("\t---------------------------------------");
		System.out.println(" \t1. exibir mensagem de boas vindas ");
		System.out.println("\t---------------------------------------");
		System.out.println(" \t2. monstrar a data e horas atuiais ");
		System.out.println("\t---------------------------------------");
		System.out.println(" \t3. sair ");
		System.out.println("\t---------------------------------------");
		System.out.println("\t=======================================");

		int vai = sc.nextInt();

		switch (vai) {
		case 1:
			System.out.println("Seja bem vindo a nossa JBE ");
			returnParaMenu();
			break;
		case 2:
			java.util.Date now = new java.util.Date();
			System.out.println("data e hora atuais " + "" + now);
			returnParaMenu();
			break;
		case 3:
			System.out.println("Saindo do programa");
			break;
		default:
			System.out.println("opção invalida");
			returnParaMenu();
		}
		sc.close();

	}

	public static void returnParaMenu() {
		monstrarMenu();
	}
}

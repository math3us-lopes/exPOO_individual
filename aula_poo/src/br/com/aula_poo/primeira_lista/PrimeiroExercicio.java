package br.com.aula_poo.primeira_lista;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("escreva o seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("escreva seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		scanner.close();
		System.out.println("Olá, " +nome+ " " +sobrenome+ " "
				+ ".Seja bem vindo a o mundo de Programação orientada a objeto com JAVA.");

	}

}
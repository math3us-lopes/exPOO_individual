package br.com.aulapoo.ExercicioListaUm;

import java.util.Scanner;

public class SegundoExercicioZeus {

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		double resultadoDivisao;

		// Leitura dos números
		System.out.print("Número 1: ");
		num1 = sc.nextInt();
		System.out.print("Número 2: ");
		num2 = sc.nextInt();

		// Operações matemáticas
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtração: " + (num1 - num2));
		System.out.println("Multiplicação: " + (num1 * num2));

		// Verificação para divisão por zero
		if (num2 != 0) {
			resultadoDivisao = (double) num1 / num2; // Conversão para real (double)
			System.out.println("Divisão: " + resultadoDivisao);
		} else {
			System.out.println("Erro: Divisão por zero não é permitido.");
		}

		sc.close();
	}
}

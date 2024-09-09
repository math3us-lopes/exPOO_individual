package br.com.aulapoo.exerciciolistaDois;

import java.util.Scanner;

public class SextoExLdoissMultplosdeSeis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio;
		int fim;
		int c;
		int soma = 0;
		int contador = 0;

		System.out.print("digite o primeiro intervalo: ");
		inicio = sc.nextInt();
		System.out.print("digite o segundo intervalo: ");
		fim = sc.nextInt();

		System.out.println("escreva os multiplos de 6 :");
		for (int i = inicio; i <= fim; i++) {
			c = i % 6;
			if (c == 0 && contador < 3) {
				System.out.println(i + "\t");
				soma += i;
				contador++;
			}
		}
		System.out.println("os três ultimos multiplos de 6 são:");
		contador = 0;
		for (int i = fim; i >= inicio; i--) {
			c = i % 6;
			if (c == 0 && contador < 3) {
				System.out.println(i + "\t");
				soma += i;
				contador++;
			}
		}
		System.out.println("a soma dos três ultimos com os três primeiros são: " + soma + "\n");
		sc.close();
	}

}

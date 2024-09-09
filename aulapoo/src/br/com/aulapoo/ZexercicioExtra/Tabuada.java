package br.com.aulapoo.ZexercicioExtra;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Tabuada tb = new Tabuada();
		tb.retorna();
	}

	public void retorna() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int resultado = 0;
		System.out.println("digite o numero da tabuada: ");
		n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			resultado = n * i;
			System.out.println(n + "x" + i + "=" + resultado);

		}
		retorna();
		sc.close();
	}

	public void retornaM() {
		retorna();
	}
}

package br.com.aulapoo.exerciciolistaDois;

import java.util.Scanner;

public class QuartoExLdoissSomadsTriangulos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double angulo1;
		double angulo2;
		double angulo3;
		System.out.println("Digite o Valor do primeiro ângulo: ");
		angulo1 = sc.nextDouble();
		System.out.println("Digite o Valor do segundo ângulo: ");
		angulo2 = sc.nextDouble();
		System.out.println("Digite o Valor do terceiro ângulo: ");
		angulo3 = sc.nextDouble();
		// Verfica se forma um triângulo

		if (angulo1 + angulo2 + angulo3 == 180) {
			System.out.println("Os ângulos informados não formam um triângulo válido.");
		} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.println("O triângulo é Acutângulo.");
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("O triângulo é Obtângulo.");
		} else {
			System.out.println("O triângulo é Retângulo.");
		}
		sc.close();
	}

}

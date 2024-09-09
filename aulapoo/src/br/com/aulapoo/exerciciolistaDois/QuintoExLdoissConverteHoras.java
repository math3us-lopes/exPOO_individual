package br.com.aulapoo.exerciciolistaDois;

import java.util.Scanner;

public class QuintoExLdoissConverteHoras {

	public static void main(String[] args) {
		double horas;
		double minutos;
		double segundos;
		Scanner sc = new Scanner(System.in);

		System.out.println(" digite o valor em horas: ");
		horas = sc.nextDouble();

		// paso 1: converter horas para minutos
		minutos = horas * 60;
		System.out.println("Passo 1: " + horas + " horas * 60 minutos = " + minutos + " minutos");

		// paso 2: converter minutos para segundos
		segundos = minutos * 60;
		System.out.println("Passo 2: " + minutos + " minutos * 60 segundos = " + segundos + " segundos");

		System.out.println("Resultado: " + horas + " horas equivalem a " + segundos + " segundos");
		sc.close();

	}

}

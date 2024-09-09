package br.com.aulapoo.exerciciolistaDois;

import java.time.LocalDate;

public class Data {

	public static void main(String[] args) {
		LocalDate id = LocalDate.now();
		System.out.println("data e hora atuais " + "" + id);
		System.out.println("dias da semana" + " " + id.getDayOfWeek());
		System.out.println(" mês atual " + " " + id.getDayOfMonth());
		System.out.println("  dia do ano" + " " + id.getDayOfYear());
		System.out.println("data e hora atuais " + " " + id.atTime(0, 0));

	}

}

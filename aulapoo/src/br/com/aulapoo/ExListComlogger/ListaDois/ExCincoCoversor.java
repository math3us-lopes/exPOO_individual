package br.com.ExListComlogger.ListaDois;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExCincoCoversor {
	static Logger log = Logger.getLogger(ExCincoCoversor.class.getName());

	public static void main(String[] args) {
		double horas;
		double minutos;
		double segundos;
		Scanner sc = new Scanner(System.in);

		log.info(" digite o valor em horas: ");
		horas = sc.nextDouble();

		// paso 1: converter horas para minutos
		minutos = horas * 60;
		log.info("Passo 1: " + horas + " horas * 60 minutos = " + minutos + " minutos");

		// paso 2: converter minutos para segundos
		segundos = minutos * 60;
		log.info("Passo 2: " + minutos + " minutos * 60 segundos = " + segundos + " segundos");
		log.info("Resultado: " + horas + " horas equivalem a " + segundos + " segundos");
		sc.close();

	}

}

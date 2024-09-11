package br.com.ExListComlogger.ListaDois;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExSeisMultiplosDSeis {
	static Logger log = Logger.getLogger(ExCincoCoversor.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio;
		int fim;
		int c;
		int soma = 0;
		int contador = 0;

		log.info("digite o primeiro intervalo: ");
		inicio = sc.nextInt();
		log.info("digite o segundo intervalo: ");
		fim = sc.nextInt();

		log.info("escreva os multiplos de 6 :");
		for (int i = inicio; i <= fim; i++) {
			c = i % 6;
			if (c == 0 && contador < 3) {
				log.info(i + "\t");
				soma += i;
				contador++;
			}
		}
		log.info("os três ultimos multiplos de 6 são:");
		contador = 0;
		for (int i = fim; i >= inicio; i--) {
			c = i % 6;
			if (c == 0 && contador < 3) {
				log.info(i + "\t");
				soma += i;
				contador++;
			}
		}
		log.info("a soma dos três ultimos com os três primeiros são: " + soma + "\n");
		sc.close();
	}

}

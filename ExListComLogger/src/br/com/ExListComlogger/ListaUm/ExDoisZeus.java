package br.com.ExListComlogger.ListaUm;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExDoisZeus {
	private final static Logger log = Logger.getLogger(ExDoisZeus.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			int num1, num2;
			double resultadoDivisao;

			// leitura dos numeros
			log.info("Digite um Número : ");
			num1 = sc.nextInt();

			log.info("Digite outro Número : ");
			num2 = sc.nextInt();

			// operações Matemáticas

			log.info("Soma: " + (num1 + num2));
			log.info("Subtração: " + (num1 - num2));
			log.info("Multiplicação: " + (num1 * num2));

			// Verificação para a divisão

			if (num2 != 0) {
				resultadoDivisao = (double) num1 / num2;
				log.info("Divisão: " + (num1 / num2));
			} else {
				log.severe("erro: Divisão por zero não é permitido.");
			}

			// Perguntar se deseja continuar

			log.info("Deseja realizar outra operação? (sim ou não)");
			String resposta = sc.next();
			if (resposta.equalsIgnoreCase("Não")) {
				continuar = false;
			}
		}
		sc.close();

	}

}

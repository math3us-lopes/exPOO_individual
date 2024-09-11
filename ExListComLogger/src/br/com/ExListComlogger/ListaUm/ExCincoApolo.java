package br.com.ExListComlogger.ListaUm;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Scanner;

public class ExCincoApolo {

	static Logger logger = Logger.getLogger(ExCincoApolo.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

		// Substituindo System.out.println() por logger.info()
		logger.info("Escolha uma das questões abaixo para responder em 5 segundos:");
		logger.info("\n Expressão 1) (2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66)");
		logger.info("\n Expressão 2) (2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9)");
		logger.info("\n");

		opcao = sc.nextInt();

		int contador = 5;
		for (int i = contador; i >= 0; i--) {
			logger.info("\n" + i); // Logando a contagem regressiva
			try {
				Thread.sleep(1000); // Pausa de 1 segundo
			} catch (InterruptedException e) {
				logger.log(Level.SEVERE, "Erro ao aguardar", e);
			}
		}

		switch (opcao) {
		case 1:
			// Substituindo System.out.println() por logger.info() para respostas
			logger.info("Resposta correta: " + (2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66));
			break;

		case 2:
			logger.info("Resposta correta: " + (2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9));
			break;

		default:
			// Usando logger.warning() para opções inválidas
			logger.warning("Opção inválida! Tente novamente.");
		}

		sc.close(); // Fechando o scanner
	}
}

package br.com.ExListComlogger.ListaDois;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExQuatroSomaTriangulos {
	static Logger log = Logger.getLogger(ExQuatroSomaTriangulos.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double angulo1;
		double angulo2;
		double angulo3;
		log.info("Digite o Valor do primeiro ângulo: ");
		angulo1 = sc.nextDouble();
		log.info("Digite o Valor do segundo ângulo: ");
		angulo2 = sc.nextDouble();
		log.info("Digite o Valor do terceiro ângulo: ");
		angulo3 = sc.nextDouble();
		// Verifica se os ângulos formam um triângulo válido
		if (angulo1 + angulo2 + angulo3 == 180) {
			// Verifica o tipo de triângulo
			if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
				log.warning("O triângulo é Acutângulo.");
			} else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
				log.warning("O triângulo é Retângulo.");
			} else {
				log.warning("O triângulo é Obtusângulo.");
			}
		} else {
			log.severe("Os ângulos informados não formam um triângulo válido.");
		}

		sc.close();
	}
}
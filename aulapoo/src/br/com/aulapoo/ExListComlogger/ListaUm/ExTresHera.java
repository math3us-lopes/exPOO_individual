package br.com.ExListComlogger.ListaUm;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExTresHera {
  private final static Logger log = Logger.getLogger(ExTresHera.class.getName());
	public static void main(String[] args) {
		int id1;
		int id2;
		int id3;
		int id4;
		int id5;
		int minhaIdade;
		double soma;
		Scanner sc = new Scanner(System.in);
		log.info("informe a idade do colega 1: ");
		id1 = sc.nextInt();
		log.info("informe a idade do colega 2: ");
		id2 = sc.nextInt();
		log.info("informe a idade do colega 3: ");
		id3 = sc.nextInt();
		log.info("informe a idade do colega 4: ");
		id4 = sc.nextInt();
		log.info("informe a idade do colega 5: ");
		id5 = sc.nextInt();
		log.info("qual a minha idade: ");
		minhaIdade = sc.nextInt();
		soma = id1 + id2 + id3 + id4 + id5;
		minhaIdade += soma;

		log.info("o tempo de vida dos meus colegas  " + minhaIdade + ".anos.");
		sc.close();


	}

}

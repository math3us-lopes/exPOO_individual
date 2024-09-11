package br.com.ExListComlogger.ListaDois;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExDoisMinhaIdade {

	private final static Logger log = Logger.getLogger(ExDoisMinhaIdade.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		int ano;
		int mes;
		int dt_nascimento;
		log.info("digite o mes do seu nascimento: ");
		mes = sc.nextInt();
		log.info("digite seu ano de  Nascimento: ");
		dt_nascimento = sc.nextInt();
		log.info("digite o Ano do calendario Atual: ");
		ano = sc.nextInt();
		idade = ano - dt_nascimento;
		if (mes <= 8) {

			log.info("sua idade atual é :" + idade + " " + "anos");
		} else {
			log.info(" voce ainda tem :" + (idade - 1) + " " + "anos");
		}

		sc.close();

	}

}

package br.com.ExListComlogger.ListaDois;

import java.util.Scanner;
import java.util.logging.Logger;
public class ExUmUniverso {

	private final static Logger log = Logger.getLogger(ExUmUniverso.class.getName());
	public static void main(String[] args) {
		ExUmUniverso p = new ExUmUniverso();
		p.mostrarMenu(); // Chama o método para exibir o menu inicial
	}

	public void mostrarMenu() {
		Scanner sc = new Scanner(System.in);
		log.info("==========Guia=Mochileiro=das=Gálaxias===================");
		log.info("---------------------------------------------------------");
		log.info("----------1 para exibir mensagem-------------------------");
		log.info("----------2 para a resposta------------------------------");
		log.info("----------3 para conhecer um breve Resumo do livro  ---- ");
		log.info("----------4 explicando o porque do número--------------- ");
		log.info("----------0 para sair------------------------------------");
		log.info("=========================================================");
		int universo = sc.nextInt();

		switch (universo) {
		case 0:
			log.warning("Muito obrigado por nos visitar!\nO Universo agradece, volte sempre.");
			return; // Encerra o programa
		case 1:
			log.info("De acordo com o livro o guia do mochileiro das galáxias, qual é o número do Universo?");
			returnParaMenu(); // Volta ao menu após a execução
			break;
		case 2:
			log.info("Resposta : O número do Universo é 42");
			returnParaMenu(); // Volta ao menu após a execução
			break;
		case 3:
			log.info(
					"Na saga “O Guia do Mochileiro das Galáxias,” os Magratheans, especialistas em construir planetas sob encomenda,\n"
							+ "foram contratados para criar o supercomputador Pensamento Profundo.\n"
							+ "Seu objetivo era decifrar a “Pergunta Fundamental da Vida, do Universo e de Tudo” para uma superinteligência curiosa.\n"
							+ "O processo de construção do Pensamento Profundo levou muitos anos, resultando em um computador colossal.\n"
							+ "Após sua ativação, e um tempo de processamento de milhões de anos, o supercomputador revelou a resposta enigmática de 42.");
			returnParaMenu(); // Volta ao menu após a execução
			break;
		case 4:
			log.info(
					"O número 42 tornou-se icônico na cultura pop como a resposta definitiva e sem sentido para a vida, o universo e tudo mais.\n"
							+ "A escolha do número 42 por Douglas Adams foi, segundo o autor, uma piada arbitrária sem um significado real.\n"
							+ "No entanto, isso apenas aumentou o mistério e o fascínio em torno do número.");
			returnParaMenu(); // Volta ao menu após a execução
			break;
		default:
			log.severe("Número inexistente!");
			returnParaMenu(); // Volta ao menu após uma entrada inválida
			break;
		}

		sc.close(); // Fecha o scanner após a execução
	}

	public void returnParaMenu() {
		mostrarMenu(); // Volta ao menu inicial chamando o método novamente
	}
}
package br.com.aulapoo;
import java.util.Scanner;
public class QuintoExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("\t============Menu======================");
		System.out.println(" \tEscolha uma opcão!");
		System.out.println("\t---------------------------------------");
		System.out.println("\t---------------------------------------");
		System.out.println(" \t1. exibir mensagem de boas vindas ");
		System.out.println("\t---------------------------------------");
		System.out.println(" \t2. monstrar a data e horas atuiais ");
		System.out.println("\t---------------------------------------");
		System.out.println(" \t3. sair ");
		System.out.println("\t---------------------------------------");
		System.out.println("\t=======================================");
		
		int vai = sc.nextInt();
		
		switch(vai) {
		case 1:
			System.out.println("Seja bem vindo a nossa JBE ");
			break;
		case 2:
			java.util.Date now = new java.util.Date();
			System.out.println("data e hora atuais "+""+ now);
		break;
		case 3:
			System.out.println("Saindo do programa");
			break;
			default: 
				System.out.println("opção invalida");
		}
		sc.close();

	}

}

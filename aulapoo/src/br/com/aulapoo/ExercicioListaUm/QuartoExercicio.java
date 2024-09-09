package br.com.aulapoo.ExercicioListaUm;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("digite seu nome: ");
		String nome = sc.nextLine();
		if(nome.equals("matheus") ) {
			System.out.println("olá "+nome+" Seja bemvindo");
		}else {
			System.out.println("Acesso negado !");
		}
		sc.close();

	}

}

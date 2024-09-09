
package br.com.aulapoo.exerciciolistaDois;

import java.util.Scanner;
//Programa Média final dos alunos Pegando os 4 Bimestres.

public class PrimeiroExLdois {

	public static void main(String[] args) {
		PrimeiroExLdois p= new PrimeiroExLdois();
		p.opMenu();
		}
		public void opMenu() {
		Scanner sc = new Scanner(System.in);
		String[] nomes = { "Matheus", "Francisco", "Alessandra", "Savio" };
		double[][] notas = { { 10.0, 8.5, 9.8, 10.0 },
				{ 7.5, 90.2, 6.9, 7.8 }, 
				{ 6.5, 5.0, 4.9, 7.5 },
				{ 10.0, 10.0, 9.5, 8.5 } };
		double[] media = new double[4];
		for (int i = 0; i < 4; i++) {
			double soma = 0.0;
			for (int c = 0; c < 4; c++) {
				soma += notas[i][c];

			}
			media[i] = soma / 4;
		}
		System.out.println("Digite o número do Primeiro Aluno(0 a 3)");
		int aluno = sc.nextInt();
		if (aluno >= 0 && aluno < 4) {
			String apr;
			if (media[aluno] >= 7) {
				apr = "Aprovado";
			} else {
				apr = "Reprovado, tente no próximo Ano!";
			}
			System.out.println("====================");
			System.out.println("   Aluno: " + nomes[aluno]);
			System.out.println("--------------------");
			System.out.println("      1B : " + notas[aluno][0]);
			System.out.println("      2B : " + notas[aluno][1]);
			System.out.println("      3B : " + notas[aluno][2]);
			System.out.println("      4B : " + notas[aluno][3]);
			System.out.println("--------------------");
			System.out.println("Média : " + media[aluno]);
			System.out.println("       " + apr);
			System.out.println("====================");
			returnMenu();

		} else {
			System.out.println("Número inválido ! digite um número de 0 a 3");
			returnMenu();
		}
		sc.close();

	}
		public void returnMenu(){
			opMenu();
		}
}

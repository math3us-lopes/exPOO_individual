package br.com.aulapoo.exerciciolistaDois;

import java.util.Scanner;

public class SetimoExLdoisEstudoDaMadrugada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroEstudantes;
		double porcentagemDisciplina1;
		double porcentagemDisciplina2;
		double porcentagemMedia;
		double estudantesMadrugada;

		// Identifica a quantidade de alunos
		System.out.println("Diga, qual o número de estudantes da turma: ");
		numeroEstudantes = sc.nextInt();

		// Definir as porcentagens para as duas disciplinas
		porcentagemDisciplina1 = 35.0;
		porcentagemDisciplina2 = 30.0;

		// Cálculo da porcentagem e média dos estudantes que trabalham de madrugada
		porcentagemMedia = (porcentagemDisciplina1 + porcentagemDisciplina2) / 2.0;

		// Cálculo do número de estudantes que estudam de madrugada
		estudantesMadrugada = (porcentagemMedia / 100.0) * numeroEstudantes;

		// Exibir resultado ao assistente conforme enunciado do exercício
		System.out.println(
				"Na média das duas disciplinas, " + estudantesMadrugada + " estudantes estudam de madrugada.\n");

		sc.close();
	}
}
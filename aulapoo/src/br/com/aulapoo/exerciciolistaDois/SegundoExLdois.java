package br.com.aulapoo.exerciciolistaDois;
// programa que  descobre a minha Idade atual. 
import java.util.Scanner;

public class SegundoExLdois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		int ano;
		int mes;
		int dt_nascimento;
		System.out.print("digite o mes do seu nascimento: ");
		mes = sc.nextInt();
		System.out.print("digite seu ano de  Nascimento: ");
		dt_nascimento = sc.nextInt();
		System.out.print("digite o Ano do calendario Atual: ");
		ano = sc.nextInt();
		idade = ano - dt_nascimento;
		if (mes <= 8) {

			System.out.println("sua idade atual é :" + idade + " " + "anos");
		} else {
			System.out.println(" voce ainda tem :" + (idade - 1) + " " + "anos");
		}

		sc.close();

	}

}

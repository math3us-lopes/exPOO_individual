package br.com.aulapoo.ZexercicioExtra;

import java.util.Scanner;

public class ExExtradois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int soma;
		System.out.print("digite o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.print("digite o segundo numero: ");
		num2 = sc.nextInt();
		soma=num1+num2;
		System.out.println("o resultado é: "+soma);
		sc.close();
	}

}

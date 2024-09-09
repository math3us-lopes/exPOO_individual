package br.com.aulapoo.ZexercicioExtra;

import java.util.Scanner;

public class EscolhaCaso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("======Menu=Week=============");
		System.out.println("----------------------------");
		System.out.println("-------s para S-------------");
		System.out.println("-------t para t-------------");
		System.out.println("-------q para q-------------");
		System.out.println("============================");
		String  week= sc.nextLine();
		
		switch( week) {
		case "s":
			System.out.println("Segunda feira");
			break;
		case "t":
			System.out.println("terça feira");
			break;
		case "q":
			System.out.println("quarta feira");
			break;
		
		    default :
			System.out.println("este dia não existe");
		}
			sc.close();
	}
	
}

package br.com.aulapoo;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		 int id1; 
		 int id2;
		 int id3;
		 int id4; 
		 int id5;
		 int minhaIdade;
		 double soma;
		 Scanner sc =new Scanner(System.in);
		 System.out.print("informe a idade do colega 1: ");
		 id1 = sc.nextInt();
		 System.out.print("informe a idade do colega 2: ");
		 id2 = sc.nextInt();
		 System.out.print("informe a idade do colega 3: ");
		 id3 = sc.nextInt();
		 System.out.print("informe a idade do colega 4: ");
		 id4 = sc.nextInt();
		 System.out.print("informe a idade do colega 5: ");
		 id5 = sc.nextInt();
		 System.out.print("qual a minha idade: ");
		 minhaIdade = sc.nextInt();
		 soma = id1 + id2 + id3 +id4 +id5 ;
		 minhaIdade += soma ;
		 
		 System.out.println("o tempo de vida dos meus colegas  "+minhaIdade+".anos.");
		 sc.close();
		 

	}

}    

package br.com.aulapoo.ZexercicioExtra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SomaMedia {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    double n1=0.;
		    double n2=0.;
		   double n3=0.;
		   double n4=0.;
		   
		   
		   System.out.println("digite a nota n1:");
		   n1=sc.nextDouble();
		 
		   System.out.println("digite a nota n2:");
		   n2=sc.nextDouble();
		   
		   System.out.println("digite a nota n3:");
		   n3=sc.nextDouble();
		   
		   System.out.println("digite a nota n4:");
		   n4=sc.nextDouble();
		   DecimalFormat df= new DecimalFormat("##,#");
		   System.out.println( " A media das quatro soma é:"+  df.format(( n1 + n2 + n3 + n4)/4));
		   sc.close();

	}
	
}

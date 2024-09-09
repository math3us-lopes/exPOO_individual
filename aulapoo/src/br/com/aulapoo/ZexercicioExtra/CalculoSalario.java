package br.com.aulapoo.ZexercicioExtra;

public class CalculoSalario {

	public static void main(String[] args) {
	  double salario=5000.95;
	  
	 if(salario>=1411.81 && salario<=1751.81) {
		 salario=salario*0.07;

	 }else if(salario==1751.82 && salario<=2919.72){
		   salario = salario * 0.91;
	
	 }else if(salario==2919.82 && salario<=4985.74){
		salario = salario * 0.6;
		
	}else if(salario == 5839.45 || salario<=7538.46) {
		salario = salario *0.9;
	}
	 	System.out.printf(" Seu Salario esse mês é :%,.2f",salario);

	}

}

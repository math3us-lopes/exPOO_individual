package br.com.aulapoo.ZexercicioExtra;

import java.util.Arrays;
import java.util.List;

public class ArraysListof {

	public static void main(String[] args) {
		 String[] carros = {"Gol","Fusca","Fiesta"};
		 List lCar = Arrays.asList(carros);
		 
		 lCar.set(0, "Bmw");
		 carros[1]="Mercedes";
		 
		 for(Object carro : lCar) {
			 System.out.println(carro);
		 }
		 System.out.println("----------------------");
		 String[]cores= {"verde","vermelho","preto"};
		 List listcores=Arrays.asList(cores);
		 cores[0]="Prata";
		 System.out.println(listcores);

	}

}

package br.com.aulapoo.ZexercicioExtra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysList {

	public static void main(String[] args) {
		 List list=  Arrays.asList("Rato","Cachorro","gato","papagaio","Trinca Ferro","Sabia laranjeira");
		 
		 if(list.isEmpty()) {
			 System.out.println("Lista Vazia");
		 }else {
			 list.set(0 , "pato");
			 System.out.println(list.get(0));
			 System.out.println("A lista contém o animal Rato:?"+(list.contains("Rato")?"sim":"não"));
		 }
		 Collections.sort(list);
		 System.out.println(list);
	}

}

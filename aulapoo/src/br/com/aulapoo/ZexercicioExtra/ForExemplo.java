package br.com.aulapoo.ZexercicioExtra;

public class ForExemplo {

	public static void main(String[] args) {
		int impa = 0;
		int par = 0;
		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				par += 1;
			}else {
				impa+=1;
			}
			System.out.println(" Total numero par:"+par);
			System.out.println("total numero ipar:"+impa);
			
		}

	}

}

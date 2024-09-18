package modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Carrinho {
	private static Map<Produto, Integer> carrinho;
	public static void main(String[] args) {
		carrinho = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1:  carrinho:");
				int op=sc.nextInt();
	
		
		}
		private static void verCarrinho() {
			System.out.println("---- Produtos no seu Carrinho ----");
			if (carrinho.size() > 0) {
				for (Produto p : carrinho.keySet()) {
					System.out.println("Produto: " + p + "\nQuantidade: " + carrinho.get(p));
				}
	}
}

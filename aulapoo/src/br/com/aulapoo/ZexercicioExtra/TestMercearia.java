package br.com.aulapoo.ZexercicioExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMercearia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Mercearia> mc = new ArrayList<>();

		String continuar;

		do {
			System.out.println("Digite a descrição do produto: ");
			String descricao = sc.nextLine();

			System.out.println("Digite o valor do produto: ");
			double valor = sc.nextDouble();

			System.out.println("Digite a  quantidade : ");
			int qtd = sc.nextInt();
			sc.nextLine();

			Mercearia Merc = new Mercearia(descricao, valor, qtd);
			mc.add(Merc);
			System.out.println("Deseja comprar algo mais ? (Digite 'S' para sim e 'N' para não!) ");
			continuar = sc.nextLine();

		} while (!continuar.equalsIgnoreCase("N"));

		// exibindo detalhes da compra
		System.out.println("\nDetalhes da Compra:");
		for(Mercearia m:mc) {
			System.out.println("------------------------------");
			System.out.println("Produto: "+m.getDescricacao());
			System.out.println("Valor Unitário R$ "+m.getValor());
			System.out.println("Quantidade:"+m.getQtd());
			System.out.println("Total:R$ "+m.valorFinal());
			System.out.println("ICMS(12%): R$ "+m.calcularIcms());
			System.out.println("--------------------------------");
		}
		sc.close();
	}

}

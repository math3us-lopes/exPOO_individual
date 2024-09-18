package br.com.aulapoo.ZexercicioExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class mainProd {

	public static void main(String[] args) {
		Produto pd = new Produto("guitarra",2200,15);
		
	 Scanner sc = new Scanner(System.in);
	 ArrayList<Produto>produtos=new ArrayList<>();
	 String continuar;
	 
	 do {
		 //solicitando informações do produto
		 System.out.println("Digite a descrição do produto: ");
		 String descricao = sc.nextLine();
		 
		 System.out.println("Digite o valor do produto: ");
		 double valor = sc.nextDouble();
		 
		 System.out.println("Digite a quantidade: ");
		 int quantidade= sc.nextInt();
		 sc.nextLine();//quebra de linha 
		 
		 
		 //Criando o produto e add a lista
		 
		 Produto produto = new Produto(descricao,valor,quantidade);
		 produtos.add(produto);
		 
		 System.out.println("Deseja adicionar mais produtos? (digite 'S' para sim e 'N' para não) ");
		 continuar=sc.nextLine();
		 
		  
		 
	 }while (! continuar.equalsIgnoreCase("N"));
	 
	 System.out.println("\nDetalhes dos Produtos: ");
	 for(Produto p: produtos) {
		 System.out.println("----------------------------------");
		 System.out.println("Produto: "+p.getDescricao());
		 System.out.println("Valor unitário: R$ "+p.getValor());
		 System.out.println("Quantidade: "+p.getQuantidade());
		 System.out.println("Total: R$ "+p.calculoTotal());
		 System.out.println("ICMS (12%): R$ "+p.calcularIcms());
		 System.out.println("----------------------------------");
	 }
	 sc.close();
	}

}

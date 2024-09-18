package br.com.aulapoo.ZexercicioExtra;

public class TestImovel {

	public static void main(String[] args) {
	Imovel imo1 =new Casa("Comary",575000,false);
	Imovel imo2 =new Apto("Várzea",280500,3);
	
	Proprietario  pr1 =new Proprietario("Matheus",imo1);
	Proprietario  pr2 =new Proprietario("Bruna",imo2);
	
	System.out.println("Proprietario: "+pr1.getNome());
	System.out.println(pr1.getImovel().toString());
	System.out.println("Valor a pagar Itbi: "+pr1.getImovel().calcularImpostto());
	System.out.println("\n");
	System.out.println("Proprietario: "+pr2.getNome());
	System.out.println(pr2.getImovel().toString());
	System.out.println("Valor a pagar Itbi: "+pr2.getImovel().calcularImpostto());

	}

}

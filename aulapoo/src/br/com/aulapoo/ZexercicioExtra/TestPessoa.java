package br.com.aulapoo.ZexercicioExtra;

public class TestPessoa {

	public static void main(String[] args) {
		Pessoa ps = new Pessoa();
		
		ps.setIdPessoa(1);
		ps.setNome("Matheus");
		ps.setPeso(110.2);
		ps.setAltura(1.78);
		
		System.out.println("\n"+ps.getNome()+" "+ps.resultado());

	}

}

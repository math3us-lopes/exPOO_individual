package br.com.aulapoo.ZexercicioExtra;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario fc1 = new Funcionario("Matheus", 2500.);
		//Funcionario fc2 = new Funcionario("Monique", 1850);
		System.out.println("Folha de Pagamento ");
		System.out.println(" Funcionario " + fc1.getNome()+"\n"+"Salario bruto" + fc1.getSalario()+"\n"+"Inss(11%): "+fc1.calcularInss());
		System.out.println(" Vale-Transporte(6%) " + fc1.calcularValeTransporte()+"\n"+"Salario Liquido: "+fc1.calcularSalarioLiquido());
		

	}

}

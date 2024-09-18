package br.com.aulapoo.ZexercicioExtra;

public class mainVeiculo {

	public static void main(String[] args) {
	Veiculo vc = new Veiculo();
	vc.placa="LZX9090";
	vc.tipo="Flex";
	vc.valor=20000;
	
	System.out.println(" Carro: "+vc.tipo+"\n placa: "+vc.placa+" \nValor: "+vc.valor);
	System.out.println("\nO valor do IPVA é: "+vc.CalculaIPVA());
	}

}

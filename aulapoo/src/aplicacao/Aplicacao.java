package aplicacao;

import contas.ContaPoupanca;
import contas.conta;

public class Aplicacao {

	public static void main(String[] args) {
		System.out.println("Banco Residencia");
		conta conta = new conta();
		conta.agencia=1;
		 conta.setTitular("Monarah");
		   System.out.println("Prabéns "+ conta.getTitular()+" sua conta foi aberta");
		  // System.out.println("Sua Agencia é :"+conta.agencia);
		
		conta conta2=new conta("Marcio");
		 System.out.println("Prabéns "+conta2.getTitular() +" sua conta foi aberta");
		 System.out.println("Sua Agencia é :"+conta2.agencia );
		
		
		 ContaPoupanca poupanca= new ContaPoupanca();
		 poupanca.setRendimento(10);
		 System.out.println("Seun rendimento é de :"+poupanca.getRendimento()+"por cento.");

	}

}

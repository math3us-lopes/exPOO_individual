package contas;

public class conta {
	public int agencia;
   private String titular;
   private int numero;
   private double saldo;
   
   public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public conta() {
	   
   }
   
   public conta(String nome) {
	   titular=nome;
	   System.out.println("Prabéns");
   }
   
   public void depositar(double valor) {
	   saldo+=valor;
   }
   public void sacar(double valor) {
	   saldo-=valor;
   }
  
}

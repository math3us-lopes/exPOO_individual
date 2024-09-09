package br.com.aulapoo.balanco;

public class IntegerBalancoTri {
    public static void main(String[] args) {
    	//Removendo nessecidades do Static
    	 IntegerBalancoTri balanco  = new IntegerBalancoTri();
    	balanco.soma();
      
    }
    public void soma() {
    	  Integer gastosJaneiro = 15000;
          Integer gastosFevereiro = 23000;
          Integer gastosMarco = 17000;

          
          Integer gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

          
          System.out.println("Gasto total no trimestre (Integer): R$ " + gastosTrimestre);
     
    }
}
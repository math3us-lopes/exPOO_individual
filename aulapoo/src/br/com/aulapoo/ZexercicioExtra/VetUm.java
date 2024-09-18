package br.com.aulapoo.ZexercicioExtra;

public class VetUm {

	public static void main(String[] args) {
		String funcionario[][] = new String[][] {{"marcos","Açougue"},{"miguel","horti-Fruit"},{"muller","gerente"}
		,{"Matheus","Fiscal"}};
			
		      for(int i=0;i<4;i++) {
		    	  System.out.println("--------------------");
		    	  
		    	  for(int j=0;j<funcionario[i].length;j++) {
		    		  System.out.println(funcionario[i][j]);
		    	  }
		      }

	}

}

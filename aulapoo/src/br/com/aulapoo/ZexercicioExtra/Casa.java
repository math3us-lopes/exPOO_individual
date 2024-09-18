package br.com.aulapoo.ZexercicioExtra;

public class Casa extends Imovel{
 private boolean garagem;

public Casa(String local, double valorImovel, boolean garagem) {
	super(local, valorImovel);
	this.garagem = garagem;
}

@Override
public String toString() {
	return super.toString()+" "+(garagem ? "tem garagem": "Não tem garagem" );
}
 
}

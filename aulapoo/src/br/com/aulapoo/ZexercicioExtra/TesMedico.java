package br.com.aulapoo.ZexercicioExtra;

public class TesMedico {

	public static void main(String[] args) {
		Medico md1 = new Medico(1234,"Larissa",0,250);
		Medico md2 = new Medico(4567,"Matheus",0,300);
		md1.pagtoD(250);
		md2.pagtoP(300);
		
		System.out.println(md1.getNome()+"\n"+md1.getSalario());
		System.out.println(md2.getNome()+"\n"+md2.getSalario());
		System.out.println(" Total de Médicos"+":"+Medico.getTotalMedicos());
	}

}

package br.com.aulapoo.ZexercicioExtra;

public class Medico {
	private int crm;
	private String nome;
	private double salario;
	private double vConsulta;
	private static int totalMedicos;

	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medico(int crm, String nome, double salario, double vConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.vConsulta = vConsulta;
		totalMedicos+=1;
	}

	public static int getTotalMedicos() {
		return totalMedicos;
	}

	public static void setTotalMedicos(int totalMedicos) {
		Medico.totalMedicos = totalMedicos;
	}

	public int getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public double getvConsulta() {
		return vConsulta;
	}

	public void pagtoD(double vConsulta) {
		salario+=vConsulta;
	}

	public void pagtoP(double vConsulta) {
		salario+=vConsulta*0.7;

	}

}

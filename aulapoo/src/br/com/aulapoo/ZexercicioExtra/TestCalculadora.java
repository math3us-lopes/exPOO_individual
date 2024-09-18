package br.com.aulapoo.ZexercicioExtra;

import javax.swing.JOptionPane;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int opcao;
		double resultado;
		String menu = "Calculadora\n\n" + "1-somar\n" + "2-subtrair\n" + "3-multiplicar\n" + "4-dividir\n"
				+ "5-finalizar\n\n";
		opcao = Integer
				.parseInt(JOptionPane.showInputDialog(null, menu, "Calculadora-Java", JOptionPane.QUESTION_MESSAGE));

		while (opcao != 5) {
			String numero1 = JOptionPane.showInputDialog("Valor 1: ");
			String numero2 = JOptionPane.showInputDialog("Valor 2: ");
			resultado = calc.Calcular(Double.parseDouble(numero1), Double.parseDouble(numero2), opcao);
			JOptionPane.showMessageDialog(null, resultado);
			opcao=Integer.parseInt(JOptionPane.showInputDialog(null,menu,"Calculadora - java",JOptionPane.QUESTION_MESSAGE));
		}
	}
 
}

package br.com.aulapoo.ZexercicioExtra;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Jopaniine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		String menu ="1-logar"+"\n2-senha:"+"\n3-sair";
		nome=JOptionPane.showInputDialog("Digite seu nome: ");
		String senha=JOptionPane.showInputDialog("Digite sua senha: ");
		if(nome.equals("matheus")&&senha.equals(1234)) {
			System.out.println("LOGIN CONFIRMADO!");
		}else {
			System.out.println("LOGIN INESISTENTE!");
		}
	}

}

package br.com.ExListComlogger.ListaUm;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExUmPosseidon {

    // Definindo o logger como estático para ser acessível dentro do método main
 private final static  Logger logger = Logger.getLogger(ExUmPosseidon.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usando logger para substituir os System.out.println()
        logger.info("Escreva o seu nome: ");
        String nome = scanner.nextLine();

        logger.info("Escreva o seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        scanner.close();

        // Mensagem de boas-vindas usando logger
        logger.info("Olá, " + nome + " " + sobrenome + ". Seja bem-vindo ao mundo de Programação Orientada a Objetos com JAVA.");
    }
}

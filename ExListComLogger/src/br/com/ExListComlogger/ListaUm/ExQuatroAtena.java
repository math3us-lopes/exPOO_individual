package br.com.ExListComlogger.ListaUm;

import java.util.logging.Logger;

public class ExQuatroAtena {
    private final static Logger log = Logger.getLogger(ExQuatroAtena.class.getName());

    public static void main(String[] args) {
        double tpC = 30.0; // Temperatura em Celsius
        double tpF = tpC * 1.8 + 32; // Convertendo para Fahrenheit
        
        log.info("Temperatura em Celsius: " + tpC);
        log.info("Temperatura em Fahrenheit: " + tpF);
    }
}

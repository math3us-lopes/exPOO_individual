package br.com.aulapoo.balanco;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BigDecimalBalancoTri {
    public static void main(String[] args) {
    	BigDecimalBalancoTri BigDecimal = new BigDecimalBalancoTri();
    	
        BigDecimal gastosJaneiro = new BigDecimal("15000");
        BigDecimal gastosFevereiro = new BigDecimal("23000");
        BigDecimal gastosMarco = new BigDecimal("17000");

    
        BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);
        BigDecimal somaFormatada= gastosTrimestre.setScale(2,RoundingMode.HALF_DOWN);
    
        System.out.println("Gasto total no trimestre (BigDecimal): R$ " + gastosTrimestre);
    }
}
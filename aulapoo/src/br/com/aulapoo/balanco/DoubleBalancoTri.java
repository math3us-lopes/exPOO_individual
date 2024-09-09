package br.com.aulapoo.balanco;

public class DoubleBalancoTri{
    public static void main(String[] args) {
        Double gastosJaneiro = 15000.0;
        Double gastosFevereiro = 23000.0;
        Double gastosMarco = 17000.0;

     
        Double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

   
        System.out.println("Gasto total no trimestre (Double): R$ " + gastosTrimestre);
    }
}
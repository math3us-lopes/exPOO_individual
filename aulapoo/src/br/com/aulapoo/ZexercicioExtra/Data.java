package br.com.aulapoo.ZexercicioExtra;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

	public static void main(String[] args) {

		// aplicando data
		Date data = new Date();
		System.out.println(data);
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(df.format(data));

		// trabalhando com GregorianCalendar
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.add(calendar.DAY_OF_YEAR, 10);
		System.out.println(calendar.getTime());
		System.out.println(df.format(calendar.getTime()));

		// obs: que LocalDate não serve para horas apenas para a data , para com horas
		// usar o LocalDateTime
		LocalDate lc = LocalDate.now();
		LocalDateTime lct = LocalDateTime.now();
		System.out.println("LocalDateTime: " + lct);
		System.out.println("LocalDate: " + lc);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("LocalDate" + lc.format(dtf));
		System.out.println("LocalDateTime: " + lct.format(dtf2));
	}

}

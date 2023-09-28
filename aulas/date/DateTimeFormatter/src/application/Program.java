package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		LocalDate date = LocalDate.parse("2022-04-23");
		LocalDateTime dateTime = LocalDateTime.parse("2023-09-21T00:18:17");
		Instant instant = Instant.parse("2023-09-21T00:18:17Z");

		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter formater2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		DateTimeFormatter formater3 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter formater4 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println(date.format(formater));
		System.out.println(formater.format(date));
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
		System.out.println(dateTime.format(formater1));
		System.out.println(formater2.format(instant));
		
		System.out.println(dateTime.format(formater3));
		System.out.println(formater4.format(instant));
		
		
	}

}

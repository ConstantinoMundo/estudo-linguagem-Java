package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {

		LocalDate date = LocalDate.parse("2023-09-26");
		LocalDateTime dateTime = LocalDateTime.parse("2023-09-26T12:23:18");
		Instant instant = Instant.parse("2023-09-26T12:23:18Z");

		/*for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
		
		LocalDate globalToLocal = LocalDate.ofInstant(instant, ZoneId.systemDefault());
		LocalDate globalToLocal1 = LocalDate.ofInstant(instant, ZoneId.of("Portugal"));
		
		LocalDateTime globalToLocal2 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalDateTime globalToLocal3 = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Moscow"));

		System.out.println(globalToLocal);
		System.out.println(globalToLocal1);
		System.out.println(globalToLocal2);
		System.out.println(globalToLocal3);
		
		System.out.println();
		System.out.println("Dia: " + date.getDayOfMonth());
		System.out.println("Mês: " + date.getMonthValue());
		System.out.println("Ano: " + date.getYear());
		
		System.out.println("Hora: " + dateTime.getHour());
		System.out.println("Minuto: " + dateTime.getMinute());



	}

}

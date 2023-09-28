package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate date = LocalDate.parse("2023-09-26");
		LocalDateTime dateTime = LocalDateTime.parse("2023-09-26T13:54:30");
		Instant instant = Instant.parse("2023-09-26T13:54:30Z");
		
		LocalDate pastWeekLocalDate = date.minusWeeks(3);
		LocalDate nextWeekLocalDate = date.plusWeeks(3);
		
		LocalDateTime pastHourLocalDateTime = dateTime.minusHours(72);
		LocalDateTime nextHourLocalDateTime = dateTime.plusHours(4320);
		
		Instant pastWeekInsant = instant.minus(5, ChronoUnit.DAYS);
		Instant nextWeekInsant = instant.plus(5, ChronoUnit.DAYS);
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		System.out.println(pastHourLocalDateTime);
		System.out.println(nextHourLocalDateTime);
		System.out.println(pastWeekInsant);
		System.out.println(nextWeekInsant);
		
		Duration duration = Duration.between(pastWeekLocalDate.atStartOfDay(), date.atStartOfDay());
		Duration duration1 = Duration.between(pastHourLocalDateTime, dateTime);
		Duration duration2 = Duration.between(nextWeekInsant, instant);
		
		System.out.println();
		System.out.println("Dias: " + duration.toDays());
		System.out.println("Dias: " + duration1.toDays());
		System.out.println("Dias: " + duration2.toDays());


	}

}

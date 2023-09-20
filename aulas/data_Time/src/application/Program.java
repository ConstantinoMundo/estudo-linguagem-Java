package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// Instaciação de data
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		Instant i = Instant.now();

		// Texto ISO 8601 --> Data hora
		LocalDate ld1 = LocalDate.parse("2023-09-20");
		LocalDateTime ldt1 = LocalDateTime.parse("2023-09-20T15:49:22");
		Instant i1 = Instant.parse("2023-09-20T15:49:22Z");

		// Texto formato customizado --> Data hora
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy LL dd");
		String text = ld.format(formatter);
		LocalDate parsedDate = LocalDate.parse(text, formatter);
		
		//Instanciação a partir de dados isolados
		System.out.println("Digite uma data de forma isolada, ano, mes e dia");
		int ano = sc.nextInt();
		int mes = sc.nextInt();
		int dia = sc.nextInt();
		LocalDate ld2 = LocalDate.of(ano, mes, dia);
		
		System.out.println(ld);
		System.out.println(ldt);
		System.out.println(i);
		System.out.println();

		System.out.println(ld1);
		System.out.println(ldt1);
		System.out.println(i1);
		System.out.println();
		
		System.out.println(parsedDate);
		System.out.println(ld2);
		
		sc.close();
	}

}

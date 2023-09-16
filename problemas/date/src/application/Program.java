package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 
		sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d1 = sdf.parse("23/04/1999");
		Date d2 = sdf1.parse("23/04/1999 12:23:33");
		Date x = new Date();
		Date x1 = new Date(System.currentTimeMillis());
		Date x2 = Date.from(Instant.parse("1990-04-23T12:30:00Z"));
		System.out.println(d1);
		System.out.println(sdf.format(d1));
		System.out.println(sdf1.format(d2));
		System.out.println("Horario actual: " + sdf1.format(x));
		System.out.println(sdf1.format(x1));
		System.out.println(sdf2.format(x2));
		 	
		sc.close();
	}

}

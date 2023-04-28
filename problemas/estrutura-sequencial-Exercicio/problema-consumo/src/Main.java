import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distanciaPercorrida, combustivelGasto, consumoMedio;
		
		System.out.print("Distancia percorrida:");
		distanciaPercorrida = sc.nextDouble();
		System.out.print("Combustível gasto: ");
		combustivelGasto = sc.nextDouble();
		
		consumoMedio = distanciaPercorrida  / combustivelGasto;
		
		System.out.printf("Consumo medio = %.3f%n", consumoMedio);
		
		sc.close();
	}
}

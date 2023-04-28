import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minuto;
		double valorPago = 50.00;

		System.out.print("Digite a quantidade de minutos: ");
		minuto = sc.nextInt();

		if (minuto > 100) {
			valorPago += (minuto - 100) * 2.0;
		}
		System.out.printf("Valor a pagar: %.2f kz", valorPago);

		sc.close();
	}

}

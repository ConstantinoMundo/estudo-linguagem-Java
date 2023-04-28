import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		System.out.println("Digite os valores das coordenadas X e Y: ");
		x = sc.nextDouble();
		y = sc.nextDouble();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Q1");
			} else if (x < 0 && y > 0) {
				System.out.println("Q2");
			} else if (x < 0 && y < 0) {
				System.out.println("Q3");
			} else {
				System.out.println("Q4");
			}

			System.out.println("Digite os valores das coordenadas X e Y: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}

		sc.close();
	}
}

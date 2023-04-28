import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, x;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();

			if (x % 2 == 0 && x > 0) {
				System.out.println("PAR");
			} else if (x % 2 == 0 && x < 0) {
				System.out.println("PAR NEGATIVO");
			} else if (x % 2 != 0 && x > 0) {
				System.out.println("IMPAR");
			} else if (x % 2 != 0 && x < 0) {
				System.out.println("IMPAR NEGATIVO");
			} else {
				System.out.println("NULO");
			}
		}
		sc.close();

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] vetAltura = new double[n];
		char[] vetGenero = new char[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Altura da %d pessoa: ", 1 + i);
			vetAltura[i] = sc.nextDouble();
			System.out.printf("Genero da %d pessoa: ", 1 + i);
			vetGenero[i] = sc.next().charAt(0);
		}

		double menorAltura = vetAltura[0];
		double maiorAltura = vetAltura[0];
		for (int i = 0; i < n; i++) {
			if (vetAltura[i] > maiorAltura) {
				maiorAltura = vetAltura[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (vetAltura[i] < menorAltura) {
				menorAltura = vetAltura[i];
			}
		}

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);

		int contMulher = 0;
		double somaAlturaMulher = 0, mediaMulher;
		int contHomem;

		for (int i = 0; i < n; i++) {
			if (vetGenero[i] == 'F') {
				contMulher++;
				somaAlturaMulher += vetAltura[i];
			}
		}

		if (contMulher != 0) {
			mediaMulher = somaAlturaMulher / contMulher;
			System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulher);
		}

		contHomem = n - contMulher;
		System.out.println("Numero de homens = " + contHomem);
		sc.close();

	}

}

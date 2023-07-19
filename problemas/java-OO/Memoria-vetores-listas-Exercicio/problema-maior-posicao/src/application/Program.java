package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posicao;
		double maiorNumero;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vetNumero = new double[n];

		for (int i = 0; i < vetNumero.length; i++) {
			System.out.printf("Digite o %dª numero: ", i + 1);
			vetNumero[i] = sc.nextDouble();
		}

		maiorNumero = vetNumero[0];
		posicao = 0;
		for (int i = 0; i < vetNumero.length; i++) {
			if (vetNumero[i] > maiorNumero) {
				maiorNumero = vetNumero[i];
				posicao = i;
			}
		}

		System.out.println();
		System.out.printf("MAIOR VALOR = %.2f\n", maiorNumero);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		sc.close();
	}

}

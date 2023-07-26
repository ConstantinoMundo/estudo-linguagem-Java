package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vet = new int[n];
		double somaPar = 0;
		int contagemPar = 0;
		double mediaPar;

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Digite o %dº numero: ", 1 + i);
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				somaPar += vet[i];
				contagemPar += 1;
			}
		}

		if (contagemPar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediaPar = somaPar / contagemPar;
			System.out.printf("MEDIA DOS PARES = %.1f", mediaPar);
		}
		sc.close();

	}

}

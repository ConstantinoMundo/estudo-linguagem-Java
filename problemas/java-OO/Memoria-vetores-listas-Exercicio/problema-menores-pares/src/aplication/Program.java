package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] vetNumero = new int[n];

		for (int i = 0; i < vetNumero.length; i++) {
			System.out.printf("Digite o %dª numero: ", i + 1);
			vetNumero[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < vetNumero.length; i++) {
			if (vetNumero[i] % 2 == 0) {
				System.out.print(vetNumero[i] + " ");
			}
		}

		int contPar = 0;
		for (int i = 0; i < vetNumero.length; i++) {
			if (vetNumero[i] % 2 == 0) {
				contPar++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + contPar);
		sc.close();
	}

}

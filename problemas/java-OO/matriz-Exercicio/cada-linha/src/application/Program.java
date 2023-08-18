package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, maior;

		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();

		int[][] matriz = new int[n][n];
		int[] maiorLinha = new int[n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		for (int i = 0; i < matriz.length; i++) {
			maior = matriz[i][0];
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
			maiorLinha[i] = maior;
		}
		
		for(int maiorlinha : maiorLinha) {
			System.out.println(maiorlinha);
		}

		sc.close();
	}

}

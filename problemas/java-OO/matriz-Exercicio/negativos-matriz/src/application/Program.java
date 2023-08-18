package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		n = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < m; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS: ");
		int valoresNegativos = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matriz[i][j] < 0) {
					valoresNegativos = matriz[i][j];
					System.out.println(valoresNegativos);
				}
			}
		}
		
		sc.close();

	}

}

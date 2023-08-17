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
		
		double [][] mat = new double[n][m];
		double [] vetor = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Digite os elementos da " + (1 + i) + " linha: ");
			for(int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		double somaLinha = 0;
		
		for(int i = 0; i < n; i++) {
			somaLinha = 0;
			for(int j = 0; j < m; j++) {
				somaLinha = somaLinha + mat[i][j];
			}
			vetor[i] = somaLinha;
		}
		
		System.out.println("VETOR GERADO: " );
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		sc.close();
	}

}

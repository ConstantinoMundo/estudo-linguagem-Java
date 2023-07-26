package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		double[] vetAltura = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dº pessoa:\n", 1 + i);
			System.out.print("Nome: ");
			vetNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetIdade[i] = sc.nextInt();
			System.out.print("Altura: ");
			vetAltura[i] = sc.nextDouble();

		}

		double somaAltura = 0;
		double mediaAltura;
		for (int i = 0; i < n; i++) {
			somaAltura += vetAltura[i];
		}
		
		System.out.println();
		mediaAltura = somaAltura / n;
		System.out.printf("Altura média: %.2f\n", mediaAltura);

		int contMenorIdade = 0;
		double percentagemMenorIdade;

		for (int i = 0; i < n; i++) {
			if (vetIdade[i] < 16) {
				contMenorIdade++;
			}
		}
		percentagemMenorIdade = contMenorIdade * 100 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentagemMenorIdade);
		
		System.out.println("Menor(es) de 16 anos:");
		for(int i = 0; i < n; i++) {
			if(vetIdade[i] < 16) {
				System.out.println(vetNome[i]);
			}
		}
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, contIdade;
		double somaAltura, alturaMedia, percentagemMenorIdade;

		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		double[] vetAltura = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dª pessoa:\n", i + 1);
			System.out.print("Nome: ");
			vetNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetIdade[i] = sc.nextInt();
			System.out.print("Altura: ");
			vetAltura[i] = sc.nextDouble();

		}

		// Soma das altura
		somaAltura = 0;
		for (int i = 0; i < n; i++) {
			somaAltura += vetAltura[i];
		}
		// Calculo da altura média
		alturaMedia = somaAltura / n;

		// Contagem das Pessoas com menos de 16 anos
		contIdade = 0;
		for (int i = 0; i < n; i++) {
			if (vetIdade[i] < 16) {
				contIdade++;
			}
		}
		// Calculo das Pessoas com menos de 16 ano
		percentagemMenorIdade = (double) contIdade * 100 / n;

		System.out.println();
		System.out.println("*********************************************");
		System.out.printf("Altura média: %.2f\n", alturaMedia);
		System.out.printf("Pessoa(s) com menos de 16 anos: %.1f%%\n", percentagemMenorIdade);
		System.out.println("Menor(es) de 16 anos:");
		// Codigo para mostrar o nome das pessoas com menos de 16 anos
		for (int i = 0; i < n; i++) {
			if (vetIdade[i] < 16) {
				System.out.println(vetNome[i]);
			}
		}

		sc.close();
	}

}

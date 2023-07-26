package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		String[] vetNome = new String[n];
		double[] vetNota1 = new double[n];
		double[] vetNota2 = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: \n", 1 + i);
			vetNome[i] = sc.nextLine();
			vetNota1[i] = sc.nextDouble();
			vetNota2[i] = sc.nextDouble();
		}

		double mediaNota;
		for (int i = 0; i < n; i++) {
			mediaNota = (vetNota1[i] + vetNota2[i]) / 2;
			if (mediaNota >= 6.0) {
				System.out.printf(vetNome[i]);
			}
		}
		sc.close();
	}

}

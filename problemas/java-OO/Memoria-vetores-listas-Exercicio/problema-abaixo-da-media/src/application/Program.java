package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		double somaVetor = 0;
		double mediaVetor;

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Digite o %dº numero: ", 1 + i);
			vet[i] = sc.nextDouble();
		}

		for (int i = 0; i < vet.length; i++) {
			somaVetor += vet[i];
		}
		System.out.println();
		
		mediaVetor = somaVetor / vet.length;
		System.out.printf("MEDIA DO VETOR = %.3f\n", mediaVetor);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < mediaVetor) {
				System.out.println(vet[i]);
			}
		}
		sc.close();
	}

}

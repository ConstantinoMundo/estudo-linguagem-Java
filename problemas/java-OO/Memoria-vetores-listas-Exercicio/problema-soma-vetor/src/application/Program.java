package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração das variaveis
		int n;
		double sum = 0.0;
		double med;

		//Entrada de dados
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vet = new double[n];
		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Digite o %d numero : ", 1 + i);
			vet[i] = sc.nextDouble();
		}
		
		//Saida de dados 
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + "  ");
		}
		
		//Soma do vetor 
		for (int i = 0; i < vet.length; i++) {
			sum += vet[i];
		}
		System.out.println();
		System.out.print("SOMA = " + sum);
		sc.close();
		
		//Media do vetor
		med = sum / n;
		System.out.println();
		System.out.println("MEDIA = " + med);
	}

}

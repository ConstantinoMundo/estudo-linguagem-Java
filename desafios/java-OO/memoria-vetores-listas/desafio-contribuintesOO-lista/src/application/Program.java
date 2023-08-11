package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<TaxPayer> listTaxPayer = new ArrayList<>();

		int n;

		Double salaryIncome;
		Double servicesIncome;
		Double capitalIncome;
		Double healthSpending;
		Double educationSpending;

		System.out.print("Quantos contribuintes você vai digitar? ");
		n = sc.nextInt();

		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do " + (i + 1) + "º contribuinte:");
			System.out.print("Renda anual com salário: ");
			salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			educationSpending = sc.nextDouble();
	
			listTaxPayer
					.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
			System.out.println();
		}

		int i = 0;
		for (TaxPayer tP : listTaxPayer) {
			i++;
			System.out.println("Resumo do " + i + "º contribuinte: ");
			System.out.println(tP);
			System.out.println();
		}

		sc.close();
	}

}

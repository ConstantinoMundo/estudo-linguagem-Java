package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> listFuncionario = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.printf("Emplyoee #%d: \n", 1 + i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(listFuncionario, id)) {
				System.out.print("Id alreddy taken! Try again: ");
				id = sc.nextInt();
			}

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Funcionario funcionario = new Funcionario(id, name, salary);
			listFuncionario.add(funcionario);

		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idEmployee = sc.nextInt();

		Funcionario func = listFuncionario.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

		// Integer pos = positionId(lisFuncionario, idEmployee);
		if (func == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			func.percentage(percent);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Funcionario emp : listFuncionario) {
			System.out.println(emp);
		}

		sc.close();

	}

	public static Integer positionId(List<Funcionario> listFuncionario, int id) {
		for (int i = 0; i < listFuncionario.size(); i++) {
			if (listFuncionario.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Funcionario> listFuncionario, int id) {
		Funcionario func = listFuncionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}

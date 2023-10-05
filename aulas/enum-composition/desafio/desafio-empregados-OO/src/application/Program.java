package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int departmentDay = sc.nextInt();

		System.out.print("Email: ");
		String email = sc.next();
		sc.nextLine();
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();

		Address address = new Address(email, telefone);
		Department department = new Department(departmentName, departmentDay, address);

		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Dados do funcionário" + i + ": ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(name, salary);

			department.addEmployee(emp);
		}
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		ShowReport(department);
		sc.close();
	}

	public static void ShowReport(Department dept) {
		
		Department dt = new Department();
		List<Employee> employees = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();

		sb.append("Departamento Vendas =  " + String.format("%.2f", + dt.payRoll() + "\n"));
		sb.append("Pagamento realizado no dia " + dt.getPayDay() + "\n");
		sb.append("Funcionários: \n");
		for (Employee emp : employees) {
			sb.append(emp.getName() + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: " + dt.getAddress().getEmail());

		sb.toString();
		System.out.println(sb);

	}

}

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
		showReport(department);
		sc.close();
	}

	public static void showReport(Department depart){
        StringBuilder sb = new StringBuilder();
        sb.append("\nFOLHA DE PAGAMENTO:\n");
        sb.append("Departamento " + depart.getName() + " R$ " + String.format("%.2f",depart.payRoll()));
        sb.append("\nPagamento realizado no dia " + depart.getPayDay());
        sb.append("\nFuncionários:\n");
        for (Employee e : depart.getEmployees()){
            sb.append(e.getName() + "\n");
        }
        sb.append("Para duvidas entrar em contato: " + depart.getAddress().getEmail());
        String text = sb.toString();
        System.out.println(text);
    }

}

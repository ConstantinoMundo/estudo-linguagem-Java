package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;

	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department derpartment) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = derpartment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDerpartment() {
		return department;
	}

	public void setDerpartment(Department derpartment) {
		this.department = derpartment;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalary;
		LocalDate date;
		for (HourContract hourContract : contracts) {
			date = hourContract.getDate();
			int dateYear = date.getYear();
			int dateMonth = date.getMonthValue();
			if (year == dateYear && month == dateMonth) {
				sum += hourContract.totalValue();
			}
		}
		return sum;
	}
}

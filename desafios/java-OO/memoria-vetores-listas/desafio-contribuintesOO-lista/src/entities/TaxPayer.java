package entities;

public class TaxPayer {
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;

	public TaxPayer() {

	}

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public Double salaryTax() {
		Double quantity;
		quantity = salaryIncome / 12;
		if (quantity < 3000.00) {
			return 0.00;
		} else if (quantity <= 5000.00) {
			return salaryIncome * 0.1;
		} else {
			return salaryIncome * 0.20;
		}
	}

	public Double servicesTax() {
		if (servicesIncome > 0.00) {
			return servicesIncome * 0.15;
		}
		return 0.00;
	}

	public Double capitalTax() {
		if (capitalIncome > 0.00) {
			return capitalIncome * 0.20;
		}
		return 0.00;
	}

	public Double grossTaX() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public Double taxRebate() {
		Double maxDedutivel;
		Double gastDedutive;

		maxDedutivel = grossTaX() * 0.30;
		gastDedutive = healthSpending + educationSpending;

		if (maxDedutivel <= gastDedutive) {
			return maxDedutivel;
		}
		return gastDedutive;
	}

	public Double netTaX() {
		return grossTaX() - taxRebate();
	}
	
	@Override
	public String toString() {
		return "Imposto bruto total: " + String.format("%.2f%n", grossTaX())  +
				"Abatimento: " + String.format("%.2f%n", taxRebate())+
				"Imposto devido: " + String.format("%.2f%n", netTaX());
	}
}

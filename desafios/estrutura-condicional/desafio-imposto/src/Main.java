import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salarioAnual, salarioMensal, prestServico;
		double ganhoCapital, gastoMedico, gastoEducacional;
		double impSalario = 0, impServico, impGanhoCapital;
		double maxDedutivel, gastDedutivel;
		double impBrutoTotal, impDevido;

		System.out.print("Renda anual com salário: ");
		salarioAnual = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		prestServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		ganhoCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastoMedico = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastoEducacional = sc.nextDouble();

		salarioMensal = salarioAnual / 12;

		if (salarioMensal < 3000.00) {
			System.out.println("ISENTO");
		} else if (salarioMensal <= 5000.00) {
			impSalario = salarioAnual * 10 / 100;
		} else {
			impSalario = salarioAnual * 20 / 100;
		}

		impServico = prestServico * 15 / 100;
		impGanhoCapital = ganhoCapital * 20 / 100;
		impBrutoTotal = impSalario + impServico + impGanhoCapital;
		maxDedutivel = impBrutoTotal * 30 / 100;
		gastDedutivel = gastoMedico + gastoEducacional;

		System.out.println();
		System.out.println("RELATORIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", impSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impGanhoCapital);
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maxDedutivel);
		System.out.printf("Gastos dedutíveis %.2f%n", gastDedutivel);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", impBrutoTotal);

		if (maxDedutivel < gastDedutivel) {
			impDevido = impBrutoTotal - maxDedutivel;
			System.out.printf("Abatimento: %.2f%n", maxDedutivel);
		} else {
			impDevido = impBrutoTotal - gastDedutivel;
			System.out.printf("Abatimento: %.2f%n", gastDedutivel);
		}
		System.out.printf("Imposto devido: %.2f%n", impDevido);

		sc.close();
	}

}

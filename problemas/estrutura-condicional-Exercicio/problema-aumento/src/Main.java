import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, percentagem, aumento, novoSalario;

		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();

		if (salario <= 1000.00) {
			percentagem = 20;
		} else if (salario <= 3000.00) {
			percentagem = 15;
		} else if (salario <= 8000.0) {
			percentagem = 10;
		} else {
			percentagem = 5;
		}

		aumento = salario * percentagem / 100;
		novoSalario = salario + aumento;
		System.out.printf("Novo salario = %.2f kz %n", novoSalario);
		System.out.printf("Aumento = %.2f kz %n", aumento);
		System.out.println("Porcentagem " + percentagem + " %");
		sc.close();
	}

}

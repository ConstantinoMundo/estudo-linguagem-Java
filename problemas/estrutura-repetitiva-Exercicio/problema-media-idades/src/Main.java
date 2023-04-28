import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade, somaIdade, cont;
		double mediaIdade;

		somaIdade = 0;
		cont = 0;

		System.out.println("Digite as idades: ");
		idade = sc.nextInt();

		while (idade >= 0) {
			somaIdade += idade;
			cont += 1;
			idade = sc.nextInt();
		}

		if (cont == 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			mediaIdade = (double) somaIdade / cont;
			System.out.printf("MEDIA = %.2f", mediaIdade);
		}

		sc.close();

	}

}

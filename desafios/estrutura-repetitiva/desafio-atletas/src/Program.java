import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, i;
		char sexo;
		String nome, nomeMaisAlto;
		double altura, peso;
		int contPeso, contHomem, contMulher;
		double somaPeso, pesoMedio, maisAlto, ptgmHomen, alturaMediaMulher, somaAlturaMulher;

		somaPeso = 0;
		contPeso = 0;
		contHomem = 0;
		contMulher = 0;
		somaAlturaMulher = 0;
		maisAlto = 0;
		nomeMaisAlto = " ";

		System.out.print("Qual a quantidade de atletas? ");
		n = sc.nextInt();

		sc.nextLine();
		for (i = 0; i < n; i++) {
			System.out.println("Digite os dados do atleta numero " + (i + 1) + ":");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);

			while (sexo != 'M' && sexo != 'F') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}

			System.out.print("Altura: ");
			altura = sc.nextDouble();
			
			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}

			System.out.print("Peso: ");
			peso = sc.nextDouble();

			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}

			// Calculo para somar os peso
			somaPeso = somaPeso + peso;

			// Atleta mais alto
			if (maisAlto < altura) {
				nomeMaisAlto = nome;
				maisAlto = altura;
			}

			// Calculo para contagem de Homens e Mulheres
			if (sexo == 'M') {
				contHomem = contHomem + 1;
			}

			if (sexo == 'F') {
				contMulher = contMulher + 1;
				somaAlturaMulher += altura;
			}
			sc.nextLine();

		}

		// Calculo para o peso Medio
		pesoMedio = somaPeso / n;

		// Calculo para percentagem de Homens
		ptgmHomen = contHomem * 100 / n;

		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
		System.out.println("Atleta mais alto: " + nomeMaisAlto);
		System.out.printf("Porcentagem de homens: %.2f %%%n", ptgmHomen);

		if (contMulher == 0) {
			System.out.println("Não há mulheres cadastradas");
		} else {
			alturaMediaMulher = somaAlturaMulher / contMulher;
			System.out.println("Altura média das mulheres: " + alturaMediaMulher);
		}
		sc.close();
	}

}

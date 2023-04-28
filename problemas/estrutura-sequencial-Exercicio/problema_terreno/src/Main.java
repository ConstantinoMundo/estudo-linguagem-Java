import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double lTerreno, cTerreno, mQuadrado;
		double areaTerreno, precoTerreno;

		System.out.print("Digite a largura do terreno: ");
		lTerreno = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		cTerreno = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		mQuadrado = sc.nextDouble();
		
		areaTerreno = lTerreno * cTerreno;
		precoTerreno = areaTerreno * mQuadrado;
		
		System.out.printf("Area do terreno = %.2f%n", areaTerreno);
		System.out.printf("Preco do terreno = %.2f%n", precoTerreno);
		

	}

}

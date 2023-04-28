import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, quantidade;
		double precoProduto, conta = 0;

		System.out.print("Codigo do produto comprado: ");
		x = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();

		switch (x) {
		case 1:
			precoProduto = 5.00;
			conta = quantidade * precoProduto;
			break;
		case 2:
			precoProduto = 3.50;
			conta = quantidade * precoProduto;
			break;
		case 3:
			precoProduto = 4.80;
			conta = quantidade * precoProduto;
			break;
		case 4:
			precoProduto = 8.90;
			conta = quantidade * precoProduto;
			break;
		case 5:
			precoProduto = 7.32;
			conta = quantidade * precoProduto;
			break;
		}
		System.out.printf("Valor a pagar: %.2f%n", conta);
		sc.close();

	}

}

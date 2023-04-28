import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoProd, quantidade, dinheiro;
		double valorApagar, troco;
		
		System.out.print("Preço unitário do produto: ");
		precoProd = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextDouble();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		valorApagar = precoProd * quantidade;
		troco = dinheiro - valorApagar;
		
		System.out.printf("TROCO = %.2f", troco);
		
		sc.close();
	}

}

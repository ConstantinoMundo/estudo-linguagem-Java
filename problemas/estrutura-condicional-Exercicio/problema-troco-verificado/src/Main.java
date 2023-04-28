import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoProduto, dinheiroRecbido, troco, resto;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		precoProduto = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiroRecbido = sc.nextDouble();
		
		if(dinheiroRecbido >= (precoProduto * quantidade)) {
			troco = dinheiroRecbido - precoProduto * quantidade;
			System.out.printf("TROCO = %.2f%n", troco);
		} else {
			resto = precoProduto * quantidade - dinheiroRecbido;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f kz", resto);
		}

		sc.close();

	}

}

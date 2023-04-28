import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		String result;

		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			result = (x < y) ? "CRESCENTE!" : "DECRESCENTE!";
			System.out.println(result);
			System.out.println("Digite dois numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();

	}

}

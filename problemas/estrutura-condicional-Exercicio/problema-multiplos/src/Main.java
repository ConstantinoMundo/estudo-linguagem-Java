import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2;

		System.out.println("Digite dois numeros inteiros:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("Sao multiplos");

		} else {
			System.out.println("Nao sao multiplos");
		}

		sc.close();
	}
}

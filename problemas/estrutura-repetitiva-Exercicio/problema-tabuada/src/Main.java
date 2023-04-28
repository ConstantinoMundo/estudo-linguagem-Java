import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, mult;

		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();

		for (int i = 1; i < 11; i++) {
			mult = n * i;
			System.out.printf("%d x %d = %d %n", n, i, mult);
		}

		sc.close();

	}

}

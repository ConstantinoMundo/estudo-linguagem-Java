import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y, troca, somaImpar, somaXY;

		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();

		/*if (x > y) {
			troca = x;
			x = y;
			y = troca;
		}*/

		somaXY = x + 1  + y -1 ;
		
		somaImpar = 0;
		for (int i = 0; x < y; i++) {
			if (i % 2 != 0) {
				somaImpar += i;
			}
		}
		System.out.println(somaImpar);
		sc.close();
	}

}

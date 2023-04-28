import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Segundo valor: ");
		b = sc.nextInt();
		System.out.print("Terceiro valor: ");
		c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.println("MENOR = " +a);
		}
		else if (b < a && b < c) {
			System.out.println("MENOR = " +b);
		}
		else {
			System.out.println("MENOR = " +c);
		}
		sc.close();
	}

}

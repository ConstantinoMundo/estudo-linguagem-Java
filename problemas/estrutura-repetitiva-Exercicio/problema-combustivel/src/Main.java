import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod, alcool, gasolina, diesel;
		alcool = 0;
		gasolina = 0;
		diesel = 0;

		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		cod = sc.nextInt();

		while (cod != 4) {
			switch (cod) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			cod = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}

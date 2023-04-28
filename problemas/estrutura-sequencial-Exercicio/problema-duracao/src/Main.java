import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int duracaoSegundo, hora, resto, minuto, segundo;
	
		System.out.print("Digite a duracao em segundos: ");
		duracaoSegundo = sc.nextInt();
		
		hora = duracaoSegundo / 3600;
		resto = duracaoSegundo % 3600;
		minuto = resto / 60;
		segundo = resto % 60;
		
		System.out.println(hora +"h:"+minuto+"m:"+segundo+"s" );
		
		sc.close();
	}

}

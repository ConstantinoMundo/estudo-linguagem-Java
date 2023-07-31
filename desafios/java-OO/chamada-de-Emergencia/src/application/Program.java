package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Emergencia;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Emergencia emergencia = new Emergencia();

		System.out.println("Olá seja Bem-vido ao serviços de emergência de Angola");
		System.out.print("Continuar (s/n) ");
		char response = sc.next().charAt(0);
		System.out.println();
		sc.nextLine();

		int cod;
		String resposta;
		if (response == 's') {
			do {
				System.out.println("Entra com os dados da emergência: ");
				System.out.print("Nome: ");
				emergencia.nomeUtente = sc.nextLine();
				System.out.print("Contacto: ");
				emergencia.contacto = sc.nextInt();
				sc.nextLine();
				System.out.print("Local: ");
				emergencia.local = sc.nextLine();
				System.out.print("Natureza da emergência: ");
				emergencia.natureza = sc.nextLine();
				System.out.print("Escolha número da emergência \n116 - Ambulância, 115 - Bombeiros, 111 - CISP, 15015 - SOS Criança: ");
				
				cod = sc.nextInt();
				switch (cod) {
				case 116:
					emergencia.tipo = "Ambulância";
					break;
				case 115:
					emergencia.tipo = "Bombeiros";
					break;
				case 111:
					emergencia.tipo = "CISP";
					break;
				case 15015:
					emergencia.tipo = " SOS Criança";
					break;
				default:
					emergencia.tipo = "valor invalido";
				}
				if (cod == 115 || cod == 111 || cod == 116 || cod == 15015 ) {
					resposta = "Respondida";
					emergencia.status = resposta;
				} else {
					resposta = "Pendente";
					emergencia.status = resposta;
				}
				if (emergencia.tipo == "valor invalido") {
					System.out.println();
					System.out.println("Numero de emergencia: " + emergencia.tipo);
					System.out.println("Tentenovamente informando um número de emergência valido");
					System.out.println("Resposta: " + emergencia.status);
				} else {
					System.out.println();
					System.out.println("Relatório de Emergência: ");
					System.out.println("************************************");
					System.out.println(emergencia);
					System.out.println("************************************");
				}
				
				
				System.out.print("Deseja Repetir?(s/n): ");
				response = sc.next().charAt(0);
				sc.nextLine();
			} while (response != 'n');
			System.out.println("Obrigado por nos contactar volte sempre!");
		} else {
			System.out.println("Sistema fechado");
		}
		
		

		sc.close();
	}

}

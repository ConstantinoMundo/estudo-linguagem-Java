package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Emergencia;
import entities.enums.EmergencyStatus;

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
		EmergencyStatus resposta;
		
		if (response == 's') {
			do {
				System.out.println("Entra com os dados da emergência: ");
				System.out.print("Nome: ");
				String userName = sc.nextLine();
				emergencia.setUserName(userName);
				System.out.print("Contacto: ");
				int contact = sc.nextInt();
				emergencia.setContact(contact);
				sc.nextLine();
				System.out.print("Local: ");
				String local = sc.nextLine();
				emergencia.setLocal(local);
				System.out.print("Natureza da emergência: ");
				String nature = sc.nextLine();
				emergencia.setNature(nature);
				System.out.print("Escolha número da emergência \n116 - Ambulância, 115 - Bombeiros, 111 - CISP, 15015 - SOS Criança: ");

				cod = sc.nextInt();
				switch (cod) {
				case 116:
					emergencia.setType("Ambulância");
					break;
				case 115:
					emergencia.setType("Bombeiros");
					break;
				case 111:
					emergencia.setType("CISP");
					break;
				case 15015:
					emergencia.setType(" SOS Criança");
					break;
				default:
					emergencia.setType("Invalido");
				}
				if (cod == 115 || cod == 111 || cod == 116 || cod == 15015) {
					resposta = EmergencyStatus.RESPONDIDA;
					emergencia.setStatus(resposta);
				} else {
					resposta = EmergencyStatus.PENDENTE;
					emergencia.setStatus(resposta);
				}
				if (emergencia.getType() == "Invalido") {
					System.out.println();
					System.out.println("Numero de emergencia: " + emergencia.getType());
					System.out.println("Tentenovamente informando um número de emergência valido");
					System.out.println("Resposta: " + resposta);
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

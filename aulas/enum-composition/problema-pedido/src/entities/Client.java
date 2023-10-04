package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String name;
	private String email;
	private LocalDate birthDate;

	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getClient() {
		return name;
	}

	public void setClient(String client) {
		this.name = client;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return name + " (" + formatter.format(birthDate) + ") - " + email;
	}
}

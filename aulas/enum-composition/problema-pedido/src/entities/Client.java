package entities;

import java.time.LocalDate;

public class Client {

	private String client;
	private String email;
	private LocalDate birthDate;

	public Client() {
	}

	public Client(String client, String email, LocalDate birthDate) {
		this.client = client;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
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

}

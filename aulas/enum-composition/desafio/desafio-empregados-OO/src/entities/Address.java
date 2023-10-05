package entities;

public class Address {
	
	private String email;
	private String phone;
	
	public Address(String email, String phone) {
		this.email = email;
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.email = phone;
	}
}

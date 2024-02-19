package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.EmergencyStatus;



public class Emergencia {
	
	SimpleDateFormat sdate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Date date = new Date();
	
	protected String userName;
	protected String local;
	protected String nature;
	protected String type;
	protected EmergencyStatus status;
	protected int contact;
	
	public Emergencia() {
		
	}
	
	public Emergencia (String userName, String local, String nature,
			String type, EmergencyStatus status, int contact) {
		this.userName = userName;
		this.local = local;
		this.nature = nature;
		this.type = type;
		this.status = status;
		this.contact = contact;
	}
	
	
	public SimpleDateFormat getSdate() {
		return sdate;
	}

	public void setSdate(SimpleDateFormat sdate) {
		this.sdate = sdate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EmergencyStatus getStatus() {
		return status;
	}

	public void setStatus(EmergencyStatus status) {
		this.status = status;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String toString() {
		return "Nome: " + userName
				+ "\nTelefone: " + contact
				+ "\nLocal: " + local
				+ "\nData: " + sdate.format(date)
				+ "\nNatureza da emergência: " + nature
				+ "\nTipo: " + type
				+ "\nStatus: " + status;
	}
	
}

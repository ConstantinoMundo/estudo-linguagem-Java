package entities;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Emergencia {
	SimpleDateFormat sdate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Date date = new Date();
	public String nome;
	public String nomeUtente;
	public String local;
	public String natureza;
	public String tipo;
	public String status;
	public int contacto;
	
	public Emergencia() {
		
	}
	
	public Emergencia (String nome, String nomeUtente, String local, String natureza, String tipo, String status, int contacto) {
		this.nome = nome;
		this.nomeUtente = nomeUtente;
		this.local = local;
		this.natureza = natureza;
		this.tipo = tipo;
		this.status = status;
		this.contacto = contacto;
	}
	
	public String toString() {
		return "Nome: " + nomeUtente
				+ "\nTelefone: " + contacto
				+ "\nLocal: " + local
				+ "\nData: " + sdate.format(date)
				+ "\nNatureza da emergência: " + natureza
				+ "\nTipo: " + tipo
				+ "\nStatus: " + status;
	}
	
}

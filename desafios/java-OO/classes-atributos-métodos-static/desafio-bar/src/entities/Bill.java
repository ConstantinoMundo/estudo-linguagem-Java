package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		double beer = 5.00;
		double barbecue = 7.00;
		double softDrink = 3.00;
		return this.beer * beer + this.barbecue * barbecue + this.softDrink * softDrink;
	}

	public double ticket() {
		double ticketBarbecue;
		if (gender == 'M') {
			ticketBarbecue = 10;
		} else {
			ticketBarbecue = 8;
		}
		return ticketBarbecue;
	}

	public double feeding() {
		double barbecue;
		if (cover() > 30.00) {
			barbecue = 0;
		} else {

			barbecue = 4.00;
		}
		return barbecue;
	}

	public double total() {
		return feeding() + ticket() + cover();
	}
	
	public String toString() {
		return String.format("%n")
				+ String.format("RELATÓRIO: %n")
				+ String.format("Consumo = Kz %.2f%n", cover())
				+ String.format("Couvert = Kz %.2f%n", feeding())
				+ String.format("Ingresso = Kz %.2f%n", ticket())
				+ String.format("Valor a pagar = Kz %.2f%n", total());
	}
}

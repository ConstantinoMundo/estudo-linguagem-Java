package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Reservation() {
	}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public long duration() {

		long days = ChronoUnit.DAYS.between(checkin, checkout);
		return days;
	}
	
	public void updateDates (LocalDate chechIn, LocalDate checkOut) {
		this.checkin = chechIn;
		this.checkout = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room " + roomNumber
				+ ", check-in: " + dtf.format(checkin)
				+ ", check-out: " + dtf.format(checkout)
				+ ", " + duration() + " nights";
	}

}

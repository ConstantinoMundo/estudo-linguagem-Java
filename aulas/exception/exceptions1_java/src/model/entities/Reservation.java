package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Reservation() {
	}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public long duration() {

		long days = ChronoUnit.DAYS.between(checkIn, checkOut);
		return days;
	}

	public String updateDates(LocalDate chechInUp, LocalDate checkOutUp) {
		// LocalDate now = LocalDate.now();
		if (checkIn.isAfter(chechInUp) && checkOut.isAfter(checkOutUp)) {
			return " Reservation dates for update must be future dates";

		}
		if (checkOut.isAfter(this.checkIn)) {
			return " Check-out date must be after check-in date";

		}
		this.checkIn = chechInUp;
		this.checkOut = checkOutUp;
		return null;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + dtf.format(checkIn) + ", check-out: " + dtf.format(checkOut)
				+ ", " + duration() + " nights";
	}

}

package model.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Reservation() {
	}

	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		if (checkIn.isAfter(checkOut)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
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

	//Method to obtain the days
	public long duration() {
		if (checkIn.isAfter(checkOut)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		Period days = Period.between(checkIn, checkOut);
		return days.getDays();
	}

	
	public void updateDates(LocalDate chechInUp, LocalDate checkOutUp) {

		/*
		 * Throws the exception and the check-in date is later than chechInUp or
		 * checkOut than checkOutUp
		 */
		if (checkIn.isAfter(chechInUp) || checkOut.isAfter(checkOutUp)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}

		// Throws exception if check-in date is later than check-out
		if (checkIn.isAfter(checkOut)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = chechInUp;
		this.checkOut = checkOutUp;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + dtf.format(checkIn) + ", check-out: " + dtf.format(checkOut)
				+ ", " + duration() + " nights";
	}

}

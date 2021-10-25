package Main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Reservations.code.Reservation;

public class Flight
{
	private int flightNumber;
	private Reservation seats;
	private Aeroplane plane;
	private String sourceLoc;
	private String destLoc;
	LocalDateTime flightDateTime;

	static private int aeroNo = 0;

	// Constructors

	public Flight(int fNum, String planeName, int fst, int bus, int eco, LocalDateTime date)
	{
		String pattern = "dd-MM-yyyy hh:mm:ss";
		flightNumber = fNum;
		seats = new Reservation(fst, bus, eco);
		plane = new Aeroplane(aeroNo, planeName, seats.getTotalCapacity());
		DateTimeFormatter formate = DateTimeFormatter.ofPattern(pattern);
		flightDateTime = date;
	}

	public void setDate()
	{
	}

	public void setLocation(String source, String desti)
	{
		sourceLoc = source;
		destLoc = desti;
	}

	public void setAeroName(String name)
	{
		plane.setName(name);
	}

	public boolean reserveSeat(int seat, char seatClass)
	{
		if (seatClass == 'A')
		{
			return seats.bookFstSeat(seat);
		} else if (seatClass == 'B')
		{
			return seats.bookBusSeat(seat);
		} else if (seatClass == 'C')
		{
			return seats.bookEcoSeat(seat);
		}
		return false;
	}

	// Details Functions
	public void showAllSeats()
	{
		seats.showAllSeats();
	}

	public void showAvailableSeats()
	{
		seats.showAvailableSeats();
	}

	public void showBookedSeats()
	{
		seats.showBookedSeats();
	}

	public void showFlightDetails()
	{
		System.out.println("Flight No. : " + flightNumber);
		System.out.println("Plane Name : " + plane.getName());
		System.out.println("Traval:  From : " + this.sourceLoc + "  To : " + this.destLoc);
		System.out.println("---- First Class ----");
		System.out.println("Total Seats : " + seats.getFstTotSeats());
		System.out.println("Reserved Seats : " + seats.getFstReserveSeats());
		System.out.println("---- Bus Class ----");
		System.out.println("Total Seats : " + seats.getBusTotSeats());
		System.out.println("Reserved Seats : " + seats.getBusReserveSeats());
		System.out.println("---- Economy Class ----");
		System.out.println("Total Seats : " + seats.getEcoTotSeats());
		System.out.println("Reserved Seats : " + seats.getEcoReserveSeats());
	}

	public String getPlaneName()
	{
		return plane.getName();
	}

	public int getFlightNumber()
	{
		return flightNumber;
	}

	public String getFrom()
	{
		return sourceLoc;
	}

	public String getTo()
	{
		return destLoc;
	}
}

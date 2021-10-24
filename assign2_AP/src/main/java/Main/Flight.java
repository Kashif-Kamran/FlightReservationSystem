package Main;

import java.time.LocalDate;

import Reservations.code.Reservation;

public class Flight
{
	private int flightNumber;
	private String flightId;
	private Reservation seats;
	private Aeroplane plane;
	private String SourceLoc;
	private String DestLoc;
	private LocalDate flightDate;

	// Constructor
	Flight(int fNum, String planeName, int fst, int bus, int eco)
	{
		flightNumber = fNum;
		seats = new Reservation(fst, bus, eco);

	}

	public void setLocation(String source, String desti)
	{
		SourceLoc = source;
		DestLoc = desti;
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

}

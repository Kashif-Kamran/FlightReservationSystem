package Reservations.code;

public class Reservation
{
	private SeatClass fstSeats;
	private SeatClass busSeats;
	private SeatClass ecoSeats;

	// Constructor
	public Reservation(int fst, int bus, int eco)
	{
		fstSeats = new SeatClass("First_Class", fst);
		busSeats = new SeatClass("Business_Class", bus);
		ecoSeats = new SeatClass("Economy_Class", eco);
	}

	// Function to booking a seat
	public boolean bookEcoSeat(int seatNo)
	{
		int error = ecoSeats.reserveSeat(seatNo);
		if (error == 2)
		{
			System.out.println("[-- Wrong Seat Number --]");
			return false;
		} else if (error == 1)
		{
			System.out.println("[-- Seat Already Reserved--]");
			return false;
		} else
		{
			return true;
		}
	}

	public boolean bookFstSeat(int seatNo)
	{
		int error = fstSeats.reserveSeat(seatNo);
		if (error == 2)
		{
			System.out.println("[-- Wrong Seat Number --]");
			return false;
		} else if (error == 1)
		{
			System.out.println("[-- Seat Already Reserved--]");
			return false;
		} else
		{
			return true;
		}
	}

	public boolean bookBusSeat(int seatNo)
	{
		int error = busSeats.reserveSeat(seatNo);
		if (error == 2)
		{
			System.out.println("[-- Wrong Seat Number --]");
			return false;
		} else if (error == 1)
		{
			System.out.println("[-- Seat Already Reserved--]");
			return false;
		} else
		{
			return true;
		}
	}

	// Functions of unbooking Seats
	public boolean unBookEcoSeat(int seatNo)
	{
		int error = ecoSeats.unReserveSeat(seatNo);
		if (error == 2)
		{
			System.out.println("[-- Wrong Seat Number --]");
			return false;
		} else if (error == 1)
		{
			System.out.println("[-- Seat is Already Not Reserved --]");
			return false;
		} else
		{
			return true;
		}
	}

	public boolean unBookFstSeat(int seatNo)
	{
		int error = fstSeats.unReserveSeat(seatNo);
		if (error == 2)
		{
			System.out.println("[-- Wrong Seat Number --]");
			return false;
		} else if (error == 1)
		{
			System.out.println("[-- Seat is Already Not Reserved --]");
			return false;
		} else
		{
			return true;
		}
	}

	public boolean unBookBusSeat(int seatNo)
	{
		int error = busSeats.unReserveSeat(seatNo);
		if (error == 2)
		{
			System.out.println("[-- Wrong Seat Number --]");
			return false;
		} else if (error == 1)
		{
			System.out.println("[-- Seat is Already Not Reserved --]");
			return false;
		} else
		{
			return true;
		}
	}

	// Show seats
	public void showAllSeats()
	{
		System.out.println("[== ALL SEATS ==]");
		System.out.println("\t--- First Class ---");
		fstSeats.showAllSeats();
		System.out.println("\t--- Business Class ---");
		busSeats.showAllSeats();
		System.out.println("\t--- Economy Class ---");
		ecoSeats.showAllSeats();
	}

	public void showBookedSeats()
	{
		System.out.println("[== Reserved Seats ==]");
		System.out.println("\t--- First Class ---");
		fstSeats.showReservedSeats();
		System.out.println("\t--- Business Class ---");
		busSeats.showReservedSeats();
		System.out.println("\t--- Economy Class ---");
		ecoSeats.showReservedSeats();
	}

	public void showAvailableSeats()
	{
		System.out.println("[== Available Seats ==]");
		System.out.println("\t--- First Class ---");
		fstSeats.showAvailSeats();
		System.out.println("\t--- Business Class ---");
		busSeats.showAvailSeats();
		System.out.println("\t--- Economy Class ---");
		ecoSeats.showAvailSeats();
	}

	public int getTotalCapacity()
	{
		int total = fstSeats.getTotSeats() + busSeats.getTotSeats() + ecoSeats.getTotSeats();
		return total;
	}
}

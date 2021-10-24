package Main;

import Reservations.code.Reservation;

public class Main
{
	public static void main(String[] arg)
	{
		// Reservation
		Reservation reserv = new Reservation(5, 10, 20);
		for (int i = 0; i <= 14; i++)
		{
			reserv.bookEcoSeat(i);
		}
		reserv.showAllSeats();
		for (int i = 0; i <= 3; i++)
		{
			reserv.unBookEcoSeat(i);
		}
		// reserv.showAllSeats();
		reserv.showAvailableSeats();

	}
}

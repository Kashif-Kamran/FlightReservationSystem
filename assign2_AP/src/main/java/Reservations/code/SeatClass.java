package Reservations.code;

public class SeatClass
{
	// Public Data members
	private String seatType;
	private int totalSeats;
	private boolean seatArray[];
	private int reservedSeats;

	// Private Data Members
	public SeatClass(String type, int total)
	{
		seatType = type;
		totalSeats = total;
		seatArray = new boolean[totalSeats];
		reservedSeats = 0;
	}

	public void showAllSeats()
	{
		for (int i = 0; i < totalSeats; i++)
		{
			if (i % 5 == 0)
			{
				System.out.println();
			}
			if (seatArray[i] == false)
			{
				System.out.print("S:" + (i + 1) + "|AV    ");
			} else
			{
				System.out.print("S:" + (i + 1) + "|BK    ");
			}
		}
		System.out.println();
	}

	public void showAvailSeats()
	{
		if (reservedSeats == totalSeats)
		{
			System.out.println("All Seats Are Reserved");
			return;
		}
		int j = 1;
		for (int i = 0; i < totalSeats; i++)
		{
			if (j % 5 == 0)
			{
				System.out.println();
			}
			if (seatArray[i] == false)
			{
				System.out.print("S:" + (i + 1) + "|AV    ");
				j++;
			}
		}
		System.out.println();
	}

	public void showReservedSeats()
	{
		if (reservedSeats == 0)
		{
			System.out.println("[-- No Seats Are Reserved --] ");
			return;
		}
		int i = 0;
		int j = 0;
		while (j < reservedSeats)
		{
			if ((i + 1) % 5 == 0)
			{
				System.out.println();
			}
			if (seatArray[i] == true)
			{
				System.out.print("S:" + (i + 1) + "|BK    ");
				j++;
			}
			i++;
		}
		System.out.println();
	}

	public int reserveSeat(int seatNumber)
	{
		if (seatNumber <= 0 || seatNumber > totalSeats)
		{
			return 2;
		} else if (seatArray[seatNumber - 1] == true)
		{
			return 1;
		} else
		{
			seatArray[seatNumber - 1] = true;
			reservedSeats++;
		}

		return 0;
	}

	public int unReserveSeat(int seatNumber)
	{
		if (seatNumber <= 0 || seatNumber > totalSeats)
		{

			return 2;
		} else if (seatArray[seatNumber - 1] == false)
		{
			System.out.println("-- Error in Unreserving Seat (Already Unreserved) --");
			return 1;
		} else
		{
			seatArray[seatNumber - 1] = false;
			reservedSeats--;
		}
		return 0;
	}

	public int getTotalReservedSeats()
	{
		return reservedSeats;
	}

	public String getSeatType()
	{
		return seatType;
	}

	int getTotSeats()
	{
		return totalSeats;
	}

}

package Main;

import java.util.Iterator;
import java.util.LinkedList;

public class FlightCalander
{
	private LinkedList<Flight> fliCal;
	private int totalFlights;
	private Flight Flight;

	public FlightCalander()
	{
		fliCal = new LinkedList();
	}

	public void AddFlight(Flight pass)
	{
		fliCal.add(pass);
	}

	public void showFlight()
	{
		int i = 0;
		Iterator<Flight> itr = fliCal.iterator();
		while (itr.hasNext())
		{
			Flight fli = itr.next();
			System.out.println(
					i + " | Flight Number : " + fli.getFlightNumber() + "| Source : " + fli.getFrom() + fli.getTo());
			i++;
		}
	}

}

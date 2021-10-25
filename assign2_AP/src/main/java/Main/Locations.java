package Main;

import java.util.Iterator;
import java.util.LinkedList;

public class Locations
{
	private LinkedList<String> location;
	int totLoc;

	public Locations()
	{
		location = new LinkedList();
	}

	public void showLocations()
	{
		System.out.println("Total Destinations : " + totLoc);
		Iterator<String> itr = location.iterator();
		int i = 0;
		while (itr.hasNext())
		{
			String obj = itr.next();
			System.out.print(i + " : " + obj + "\n");
			i++;
		}

	}

	public boolean findLocaion(String loc)
	{
		if (totLoc == 0)
		{
			return false;
		}
		Iterator<String> itr = location.iterator();
		while (itr.hasNext())
		{
			String obj = itr.next();
			if (obj == loc)
			{
				return true;
			}
		}
		return false;
	}

	public boolean addLocation(String newValue)
	{
		if (this.findLocaion(newValue))
		{ // location found so not allowed to add
			return false;
		}
		location.add(newValue);
		totLoc++;
		return true;
	}

	public String getAt(int index)
	{
		if (index < 0 || index > totLoc)
			return null;
		else
			return location.get(index);
	}

}

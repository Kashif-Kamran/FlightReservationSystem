package Main;

public class Aeroplane
{
	private int aeroId;
	private String aeroName;
	private int passangerCapacity;

	// Contructor
	public Aeroplane()
	{
		aeroId = -1;
		aeroName = "";
		passangerCapacity = -1;
	}

	public Aeroplane(int id, String name, int capacity)
	{
		aeroId = id;
		aeroName = name;
		passangerCapacity = capacity;
	}

	public void setName(String name)
	{
		aeroName = name;
	}

	public void setPesCap(int cap)
	{
		passangerCapacity = cap;
	}

	// getters
	public int getCapacity()
	{
		return passangerCapacity;
	}

	public String getName()
	{
		return aeroName;
	}

	public int getId()
	{
		return aeroId;
	}

	public void showdetails()
	{
		System.out.println("Name: " + aeroName);
		System.out.println("Plane ID : " + aeroId);
		System.out.println("Passanger Capacity : " + passangerCapacity);
	}
}

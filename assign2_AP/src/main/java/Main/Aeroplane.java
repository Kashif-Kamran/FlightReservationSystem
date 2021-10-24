package Main;

public class Aeroplane
{
	private int aeroId;
	private String aeroName;
	private int passangerCapacity;
	private static int incriment;

	// Contructor
	public Aeroplane()
	{
		aeroId = incriment;
		aeroName = "";
		passangerCapacity = -1;
		incriment++;
	}

	public Aeroplane(String name, int capacity)
	{
		incriment = 1;
		aeroId = incriment;
		aeroName = name;
		passangerCapacity = capacity;
		incriment++;
	}

	void setName(String name)
	{
		aeroName = name;
	}

	void setPesCap(int cap)
	{
		passangerCapacity = cap;
	}

	// getters
	int getCapacity()
	{
		return passangerCapacity;
	}

	String getName()
	{
		return aeroName;
	}

	int getId()
	{
		return aeroId;
	}
}

package Main;

public class Main
{
	public static void main(String[] arg)
	{
		// LinkedList<String> location = new LinkedList();
		// location.add("Karachi");
		// location.add("Islamabad");
		//
		// Flight fli = new Flight(1, "Amirates", 10, 30, 60);
		// fli.showFlightDetails();
		// fli.setLocation("Karachi", "Islamabad");
		// fli.showFlightDetails();
		Locations loc = new Locations();
		loc.addLocation("Karachi");
		loc.addLocation("Islamabad");
		loc.addLocation("Rahimyar Khan");
		loc.addLocation("Lahore");
		loc.addLocation("Rawalpindi");
	}
}

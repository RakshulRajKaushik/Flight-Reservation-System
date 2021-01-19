
public class Flight {

	public String flightNumber;
	public String airline;
	public int capacity;
	private int bookedSeats; 
		
	public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.capacity = capacity;
		this.bookedSeats = bookedSeats;
	}
	
	public String getFlightsDetails() {
		return "";
	}
	
	public boolean checkAvailability() {
		return true;
	}
	
	public void incrementBookingCounter() {
		
	}
}

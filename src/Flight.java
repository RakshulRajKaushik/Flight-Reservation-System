
public class Flight {

	private String flightNumber;
	private String airline;
	private int capacity;
	private int bookedSeats; 
		
	public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
		this.setFlightNumber(flightNumber);
		this.setAirline(airline);
		this.setCapacity(capacity);
		this.setBookedSeats(bookedSeats);
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(int bookedSeats) {
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

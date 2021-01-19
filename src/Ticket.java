
public class Ticket {

	private String pnr;
	private String from; 
	private String to;
	private Flight flight;
	private String departureDateTime; 
	private String arrivalDateTime; 
	private Passenger passenger; 
	private String setaNo; 
	private float price;
	private boolean cancelled;
	
	public Ticket(String pnr, String from, String to,Flight flight, String departureDateTime, String arrivalDateTime,
			Passenger passenger,String setaNo, float price, boolean cancelled) {
		super();
		this.setPnr(pnr);
		this.setFrom(from);
		this.setTo(to);
		this.setFlight(flight);
		this.setDepartureDateTime(departureDateTime);
		this.setArrivalDateTime(arrivalDateTime);
		this.setPassenger(passenger);
		this.setSetaNo(setaNo);
		this.setPrice(price);
		this.setCancelled(cancelled);
	}
	
	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public String getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(String arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String getSetaNo() {
		return setaNo;
	}

	public void setSetaNo(String setaNo) {
		this.setaNo = setaNo;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public String checkStatus() {
		return "";
	}
	
	public int getflightDuration() {
		return 0;
	}
	public void cancel() {
		
	}
}

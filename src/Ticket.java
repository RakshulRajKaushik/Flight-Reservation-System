
public class Ticket {

	public String pnr;
	public String from; 
	public String to;
//	public Flight flight;
	public String departureDateTime; 
	public String arrivalDateTime; 
//	public Passenger passenger; 
	public String setaNo; 
	public float price;
	public boolean cancelled;
	
	public Ticket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime,
			String setaNo, float price, boolean cancelled) {
		super();
		this.pnr = pnr;
		this.from = from;
		this.to = to;
//		this.flight = flight;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
//		this.passenger = passenger;
		this.setaNo = setaNo;
		this.price = price;
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

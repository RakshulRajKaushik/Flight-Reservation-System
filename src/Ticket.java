
public abstract class Ticket {

	private static String pnr;
	private static String from; 
	private static String to;
	private static Flight flight;
	private static String departureDateTime; 
	private static String arrivalDateTime; 
	private static Passenger passenger; 
	private static String setaNo; 
	private static float price;
	private static boolean cancelled;
	
	public Ticket(String pnr, String from, String to,Flight flight, String departureDateTime, String arrivalDateTime,
			Passenger passenger,String setaNo, float price, boolean cancelled) {
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
	
	

	public static String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public static String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public static String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public static Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public static String getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public static String getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(String arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public static Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public static String getSetaNo() {
		return setaNo;
	}

	public void setSetaNo(String setaNo) {
		this.setaNo = setaNo;
	}

	public static float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static boolean isCancelled() {
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

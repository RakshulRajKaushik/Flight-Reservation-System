
public class RegularTicket extends Ticket {

	private String specialServices; 
	
	public RegularTicket(String pnr, String from, String to,Flight flight, String departureDateTime, String arrivalDateTime,
			Passenger passenger,String setaNo, float price, boolean cancelled,String specialString) {
		super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,setaNo,price,cancelled);
		this.setSpecialServices(specialServices);
	}

	public void setSpecialServices(String specialServices) {
		this.specialServices = specialServices;
	}

	public String getSpecialServices() {
		return this.specialServices;
	}
	public void updateSpecialServices(String specialServices) {
		this.specialServices=specialServices;
	}
}

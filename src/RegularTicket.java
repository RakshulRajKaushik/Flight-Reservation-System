
public class RegularTicket extends Ticket {

	private String specialServices; 
	
	public RegularTicket(String specialServices) {
		super(specialServices, specialServices, specialServices, getFlight(), specialServices, specialServices, getPassenger(), specialServices, getPrice(), isCancelled());
		this.setSpecialServices(specialServices);
	}
	
	public void setSpecialServices(String specialServices) {
		this.specialServices = specialServices;
	}

	public String getSpecialServices() {
		return "" ;
	}
	public void updateSpecialServices(String specialServices) {
		
	}
}

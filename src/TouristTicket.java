
public class TouristTicket extends Ticket {

	private String hoteladdress;
	private String[] selectedTouristLocation=new String[5];
	
	public TouristTicket(String hoteladdress) {
		super(hoteladdress, hoteladdress, hoteladdress, getFlight(), hoteladdress, hoteladdress, getPassenger(), hoteladdress, getPrice(), isCancelled());
		this.setHoteladdress(hoteladdress);
	}
	
	public String getHoteladdress() {
		return hoteladdress;
	}

	public void setHoteladdress(String hoteladdress) {
		this.hoteladdress = hoteladdress;
	}

	public String[] getSelectedTouristLocation() {
		return selectedTouristLocation;
	}

	public void setSelectedTouristLocation(String[] selectedTouristLocation) {
		this.selectedTouristLocation = selectedTouristLocation;
	}
	
	public String[] getTouristLocations() {
		String str[]=new String[5];
		return str;
	}
	
	public void removeTouristLocations(String location) {
		
	}
	
	public void addTouristLocations(String location) {
		
	}
}
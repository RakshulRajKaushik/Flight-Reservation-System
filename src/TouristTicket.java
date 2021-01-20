
public class TouristTicket extends Ticket {

	private String hoteladdress;
	private String[] selectedTouristLocation=new String[5];
	
	public TouristTicket(String pnr, String from, String to,Flight flight, String departureDateTime, String arrivalDateTime,
			Passenger passenger,String setaNo, float price, boolean cancelled,String hoteladdress) {
		super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,setaNo,price,cancelled);
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
	
	public void addTouristLocations(String location) {
		if(selectedTouristLocation.length<5)
			selectedTouristLocation[selectedTouristLocation.length]=location;
	}
	
	public void removeTouristLocations(String location) {
		for(int i=0;i<selectedTouristLocation.length;i++) {
			if(selectedTouristLocation[i].equalsIgnoreCase(location))
				selectedTouristLocation[i]="";
		}
	}
	
}
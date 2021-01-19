
public class TouristTicket {

	public String hoteladdress;
	public String[] selectedTouristLocation=new String[5];
	
	public TouristTicket(String hoteladdress) {
		super();
		this.hoteladdress = hoteladdress;
	}
	
	public  String getHotelAddress() {
		return "";
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
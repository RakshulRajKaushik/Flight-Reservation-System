/**
 * 
 */

/**
 * @author R R KAUSHIK
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void printTicketDetails(Ticket ticket) {
			System.out.println(ticket.getPnr());
		}
	public static void main(String[] args) {
		
		TouristTicket t=new TouristTicket("fhg");
		RegularTicket r=new RegularTicket("spa");
		printTicketDetails(t);
		printTicketDetails(r);
		
		
		
		// TODO Auto-generated method stub
//		Flight f=new Flight("2153", "zet", 100, 25);
//		Passenger p=new Passenger(53);
//		Ticket t=new Ticket("5456", "delhi", "goa",FlightObject, "10Am", "10pm",PassengerObject, "5465f",500.50f,false);
	}
}
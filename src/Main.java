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
		Flight f1=new Flight("IG12457","Indigo",100,90);
		Flight f2=new Flight("AI25457","Air India",300,250);
		
		Passenger p1=new Passenger("Lake Street","Kota","Rajasthan","Rohit","9460946012","ro5hit@gmail.com");
		Passenger p2=new Passenger("Dalal Street","Nagpur","MP","Rohan","9914173545","rohan54@gmail.com");
		
		TouristTicket t=new TouristTicket("PNR1234","Delhi","Goa",f1,"1300","1500",p1,"A50",500.0f,false,"Hotel Red Velvet");
		RegularTicket r=new RegularTicket("PNR5678","Delhi","Mumbai",f2,"0900","1000",p2,"W32",400.25f,false,"Hotel Paradise");
		
		printTicketDetails(t);
		printTicketDetails(r);
	}
}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add=new Address("local", "Kota", "Rajasthan");
		Contact c=new Contact("Raj", "21355", "a@gmail.com");
		Flight f=new Flight("2153", "zet", 100, 25);
		Passenger p=new Passenger(53);
		Ticket t=new Ticket("5456", "delhi", "goa", "10Am", "10pm", "5465f",500.50f,false);
	}
}
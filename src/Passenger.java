
public class Passenger {

	private static class Contact {
		private String name;
		private String phone;
		private String email;
		
		public Contact(String name, String phone, String email) {
			this.setName(name);
			this.setPhone(phone);
			this.setEmail(email);
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getContactDetails() {
			return "";
		}
		
		public void updateContactDetails(String contactDetail) {
			
		}
	}
	
	private static class Address {
		private String street;
		private String city;
		private String state;	
		
		public Address(String street, String city, String state) {
			this.setStreet(street);
			this.setCity(city);
			this.setState(state);
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getAddressDetails() {
			return "";
		}
		
		public void updateAddressDetails(String addressDetail) {
			
		}
	}
	
	private int id;
	private Address address;
	private Contact contact;  
	
	private static int idCounter;
	
	public Passenger(Address address, Contact contact) {
		this.id = idCounter;
		idCounter++;
		this.address = address;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public int getPassengerCount() {
		return idCounter;
	}
	
//	public Contact getContact() {
//		
//	}
//	public Address getAddress() {
//			
//	}	
}

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
			return "Name: "+getName()+" Phone: "+getPhone()+" Email: "+getEmail();
		}
		
		public void updateContactDetails(String contactDetail) {
			String temp="";
			int i=0;
			while(contactDetail.charAt(i)!=' ') {
				temp+=contactDetail.charAt(i);
				i++;
			}
			setName(temp);
			temp="";
			i++;
			
			while(contactDetail.charAt(i)!=' ') {
				temp+=contactDetail.charAt(i);
				i++;
			}
			setPhone(temp);
			temp=""; 
			i++;
			
			while(i!=contactDetail.length()) {
				temp+=contactDetail.charAt(i);
				i++;
			}
			setEmail(temp);
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
			return "Street: "+getStreet()+" City: "+getCity()+" State: "+getState();
		}
		
		public void updateAddressDetails(String addressDetail) {
			String temp="";
			int i=0;
			while(addressDetail.charAt(i)!=' ') {
				temp+=addressDetail.charAt(i);
				i++;
			}
			setStreet(temp);
			temp="";
			i++;
			
			while(addressDetail.charAt(i)!=' ') {
				temp+=addressDetail.charAt(i);
				i++;
			}
			setCity(temp);
			temp=""; 
			i++;
			
			while(addressDetail.charAt(i)!=' ') {
				temp+=addressDetail.charAt(i);
				i++;
			}
			setState(temp);
		}
	}
	
	private int id;
	private Address address;
	private Contact contact;  
	
	private static int idCounter;
	
	public Passenger(String street, String city, String state, String name, String phone, String email) {
		this.id = idCounter;
		idCounter++;
		address=new Address(street,city,state);
		contact=new Contact(name,phone,email);
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address.getAddressDetails();
	}

	public void setAddress(Address address) {
		String str="";
		str+=address.street+" "+address.city+" "+address.state;
		this.address.updateAddressDetails(str);
	}

	public String getContact() {
		return contact.getContactDetails();
	}

	public void setContact(Contact contact) {
		String str="";
		str+=contact.name+" "+contact.phone+" "+contact.email;
		this.contact.updateContactDetails(str);
	}
	
	public int getPassengerCount() {
		return idCounter;
	}	
}
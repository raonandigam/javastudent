package javastudent;

public class Address {

		private String street;
		private int houseno;
		private int zipcode;
		private String city;
		
	    public Address(String street, int houseno, int zipcode, String city, String state) {
			super();
			this.street = street;
			this.houseno = houseno;
			this.zipcode = zipcode;
			this.city = city;
			this.state = state;
		}

		public String getStreet() {
			return this.street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public int getHouseno() {
			return this.houseno;
		}

		public void setHouseno(int houseno) {
			this.houseno = houseno;
		}

		public int getZipcode() {
			return zipcode;
		}

		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
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

		String state;

	}



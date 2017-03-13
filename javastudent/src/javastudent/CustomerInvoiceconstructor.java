package javastudent;

public class CustomerInvoiceconstructor {
	private String name;
	private String item ;
	private double price ;
	private String address;
	
	CustomerInvoiceconstructor(String name,String item,double price,String address ){
	   this.name = name;
	   this.item = item;
	   this.price = price;
	   this.address = address;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}		

}
class Address extends CustomerInvoiceconstructor{
	String street;
	int houseno;
	int zipcode;
	String city;
	
		public Address(String name, String item, double price, String address, String street, int houseno, int zipcode,
			String city, String state) {
		super(name, item, price, address);
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

package sample;

public class CustomerInvoice   {
	private String name;
	private String item ;
	private double price ;
	private String street;
	private int houseno;
	private int zipcode;
	private String city;
	public CustomerInvoice(String name, String item, double price, String street, int houseno, int zipcode,
			String city) {
		super();
		this.name = name;
		this.item = item;
		this.price = price;
		this.street = street;
		this.houseno = houseno;
		this.zipcode = zipcode;
		this.city = city;
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
		return this.zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
		
}
package javastudent;

public class CustomerInvoice extends Address  {
	private String name;
	private String item ;
	private double price ;
	private String address;
	
      public CustomerInvoice(String street, int houseno, int zipcode, String city, String state, String name, String item,
			double price, String address) {
		super(street, houseno, zipcode, city, state);
		this.name = name;
		this.item = item;
		this.price = price;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
} 
package sample;

public class CustomerInvoice   {
	private String name;
	private String item ;
	private double price ;
	Address adrs;
	
    public CustomerInvoice(String name, String item, double price, Address adrs) {
		super();
		this.name = name;
		this.item = item;
		this.price = price;
		this.adrs = adrs;
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
	public void setPrice(double price)
	{
		this.price = price;
	}
	public Address getAdrs(){
		return this.adrs;
	}
	public void setAdrs(Address adrs1){
		adrs.setAddress(adrs1.getCity(),adrs1.getStreet(),adrs1.getHouseno(),adrs.getZipcode());}
			
}
	
			


package sample;

public class CustomerInvoice   {
	private String name;
	private String item ;
	private double price ;
	Address adrs = new Address();

	
	public CustomerInvoice(String name, String item, double price,Address adrs1) {
		this.name = name;
		this.item = item;
		this.price = price;
		adrs.setCity(adrs1.getCity());
		adrs.setStreet(adrs1.getStreet());
		adrs.setHouseno(adrs1.getHouseno());
		adrs.setZipcode(adrs1.getZipcode());
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
	public void setPrice(double price)
	{
		this.price = price;
	}
	public Address getAdrs(){
		return adrs;
	}
	public void setAdrs(Address adrs1){
		adrs.setAddress(adrs1.getCity(),adrs1.getStreet(),adrs1.getHouseno(),adrs.getZipcode());}
			
}
	
			


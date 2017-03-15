package sample;

public class CustomerInvoice   {
	private String name;
	private String item ;
	private double price ;
	private Address addr;
  
		
	public CustomerInvoice(String name, String item, double price, String strt, int hno, int zpcode, String cty) {
		this.name = name;
		this.item = item;
		this.price = price;
		this.addr = new Address(strt,hno,zpcode,cty);
		
	}
		


	public String getStrt() {
		return this.addr.getStreet();
	}
	public void setStrt(String strt) {
		this.addr.setStreet(strt);
	}
	public int getHno() {
		return this.addr.getHouseno();
	}
	public void setHno(int hno) {
		this.addr.setHouseno(hno);
	}
	public int getZpcode() {
		return this.addr.getZipcode();

	}

	public void setZpcode(int zpcode) {
		this.addr.setZipcode(zpcode);
	}
	public String getCty() {
		return this.addr.getCity();
	}
	public void setCty(String cty) {
		this.addr.setCity(cty);
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

}
	
			


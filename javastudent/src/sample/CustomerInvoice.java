package sample;

public class CustomerInvoice   {
	private String name;
	private String item ;
	private double price ;
	private String strt;
	private int Hno;
	private int Zpcode;
	private String cty;
  
		
	public CustomerInvoice(String name, String item, double price, String strt, int hno, int zpcode, String cty) {
		super();
		this.name = name;
		this.item = item;
		this.price = price;
		Address addr = new Address();
		strt = addr.getStreet();
		Hno = addr.getHouseno();
		Zpcode = addr.getZipcode();
		cty = addr.getCity();
	}
		
		
		 

	//	addr.setStreet(addr.getCity());
		


	public String getStrt() {
		return strt;
	}
	public void setStrt(String strt) {
		this.strt = strt;
	}
	public int getHno() {
		return Hno;
	}
	public void setHno(int hno) {
		Hno = hno;
	}
	public int getZpcode() {
		return Zpcode;
	}
	public void setZpcode(int zpcode) {
		Zpcode = zpcode;
	}
	public String getCty() {
		return cty;
	}
	public void setCty(String cty) {
		this.cty = cty;
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
	
			


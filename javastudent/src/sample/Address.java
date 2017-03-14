package sample;

public class Address {
	private String street;
	private int houseno;
	private int zipcode;
	private String city;
	public Address(){}
   public Address(String street, int houseno, int zipcode, String city) 
	{
		
		this.street = street;
		this.houseno = houseno;
		this.zipcode = zipcode;
		this.city = city;
	} 
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHouseno() {
		return houseno;
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
	
	public void setAddress(String street,String city,int houseno,int zipcode){
		this.street = street;
		this.houseno = houseno;
		this.zipcode = zipcode;
		this.city = city;
	}

}

package javastudent;

public class Invoice {
	public static void main(String[] args){
		
		CustomerInvoice sale = new CustomerInvoice("high street",802,94538,"fremont","ca","chaitanya","iphone",800.00,"Address");
		CustomerInvoice firstsale = new CustomerInvoice("high street",802,94538,"fremont","ca","vasu", "samsungphone", 500.00,"Adress");
		CustomerInvoice secondsale = new CustomerInvoice("high street",802,94538,"fremont","ca","krishna","nokia",800.00, "Address");
	       
		    System.out.println("name is:" +sale.getName());
			System.out.println("item is:" +sale.getItem());
			System.out.println("price is:" +sale.getPrice());
			System.out.println("address is:" +sale.getAddress());
			System.out.println("street is:" +sale.getStreet());
			System.out.println("house no is:" +sale.getHouseno());
			System.out.println("zipcode is:" +sale.getZipcode());
			System.out.println("city is:" +sale.getCity());
			System.out.println("--------------------------");
			System.out.println("name is:" + firstsale.getName());
			System.out.println("item is:" + firstsale.getItem());
			System.out.println("price is:" + firstsale.getPrice());
			System.out.println("address is:" + firstsale.getAddress());
			System.out.println("street is:" + firstsale.getStreet());
			System.out.println("house no is:" + firstsale.getHouseno());
			System.out.println("zipcode is:" + firstsale.getZipcode());
			System.out.println("city is:" + firstsale.getCity());
			System.out.println("--------------------------");
			System.out.println("name is:" +secondsale.getName());
			System.out.println("item is:" +secondsale.getItem());
			System.out.println("price is:" +secondsale.getPrice());
			System.out.println("address is:" +secondsale.getAddress());
			System.out.println("street is:" +secondsale.getStreet());
			System.out.println("house no is:" +secondsale.getHouseno());
			System.out.println("zipcode is:" +secondsale.getZipcode());
			System.out.println("city is:" +secondsale.getCity());
			
			}
	}

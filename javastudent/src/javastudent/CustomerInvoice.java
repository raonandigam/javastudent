package javastudent;

public class CustomerInvoice {
	static String name;
	static String item;
	static double price;
	static String address;
	
	public static void main(String[] args){
		
		CustomerInvoice invoice = new CustomerInvoice();
	    invoice.name = "chaitanya";
	    invoice.item = "iphone";
	    invoice.price = 800.00;
	    invoice.address = "40640,high street,apt#802,fremont,94538,ca";
	    System.out.println("customer name :" +name);
	    System.out.println("item :" +item);
	    System.out.println("item price :" +price);
	    System.out.println("customer address :" +address);
	    
	    
		
	}

}

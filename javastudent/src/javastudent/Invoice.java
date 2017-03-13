package javastudent;

public class Invoice {
	 String name;
	 String item ;
	 double price ;
	 String address;
	public static void main(String[] args){
	   CustomerInvoice invoice = new CustomerInvoice();
		 invoice.name = "chaitanya"; ;
		 invoice.item = "iphone";
		 invoice.price = 800.00;
		 invoice.address = "40640,high street,apt#802,fremont,94538,ca";
		System.out.println("name is:" +invoice.name);
		System.out.println("item is:" +invoice.item);
		System.out.println("price is:" +invoice.price);
		System.out.println("address is:" +invoice.address);
		
	}
}

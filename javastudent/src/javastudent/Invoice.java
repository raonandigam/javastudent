package javastudent;

public class Invoice {
	
public static void main(String[] args){
	
	   CustomerInvoice invoice = new CustomerInvoice();
	   CustomerInvoice invoice1 = new CustomerInvoice();
	   CustomerInvoice invoice3 = new CustomerInvoice();
	     
	     invoice.name = "chaitanya"; ;
		 invoice.item = "iphone";
		 invoice.price = 800.00;
		 invoice.address = "40640,high street,apt#802,fremont,94538,ca";
		 
		 invoice1.name = "vasu"; ;
		 invoice1.item = "samsungphone";
		 invoice1.price = 500.00;
		 invoice1.address = "40640,high street,apt#802,fremont,94538,ca";
		 
		 
		 invoice3.name = "chaitanya"; ;
		 invoice3.item = "iphone";
		 invoice3.price = 800.00;
		 invoice3.address = "40640,high street,apt#802,fremont,94538,ca";
		 
		System.out.println("name is:" +invoice.name);
		System.out.println("item is:" +invoice.item);
		System.out.println("price is:" +invoice.price);
		System.out.println("address is:" +invoice.address);
		System.out.println("--------------------------");
		System.out.println("name is:" +invoice1.name);
		System.out.println("item is:" +invoice1.item);
		System.out.println("price is:" +invoice1.price);
		System.out.println("address is:" +invoice1.address);
		System.out.println("--------------------------");
		System.out.println("name is:" +invoice3.name);
		System.out.println("item is:" +invoice3.item);
		System.out.println("price is:" +invoice3.price);
		System.out.println("address is:" +invoice3.address);
		
		
		
	}
}

package javastudent;

public class Invoice {
	
public static void main(String[] args){
	
	   CustomerInvoice invoice = new CustomerInvoice();
	   CustomerInvoice invoice1 = new CustomerInvoice();
	   CustomerInvoice invoice3 = new CustomerInvoice();
	     
	     invoice.setName ( "chaitanya") ;
		 invoice.setItem ("iphone");
		 invoice.setPrice (800.00);
		 invoice.setAddress ( "40640,high street,apt#802,fremont,94538,ca");
		 
		 invoice1.setName ( "vasu") ;
		 invoice1.setItem ( "samsungphone");
		 invoice1.setPrice ( 500.00);
		 invoice1.setAddress  ("40640,high street,apt#802,fremont,94538,ca");
		 
		 
		 invoice3.setName ( "krishna") ;
		 invoice3.setItem ("nokia");
		 invoice3.setPrice (800.00);
		 invoice3.setAddress ( "40640,high street,apt#802,fremont,94538,ca");
		 
		System.out.println("name is:" +invoice.getName());
		System.out.println("item is:" +invoice.getItem());
		System.out.println("price is:" +invoice.getPrice());
		System.out.println("address is:" +invoice.getAddress());
		System.out.println("--------------------------");
		System.out.println("name is:" +invoice1.getName());
		System.out.println("item is:" +invoice1.getItem());
		System.out.println("price is:" +invoice1.getPrice());
		System.out.println("address is:" +invoice1.getAddress());
		System.out.println("--------------------------");
		System.out.println("name is:" +invoice3.getName());
		System.out.println("item is:" +invoice3.getItem());
		System.out.println("price is:" +invoice3.getPrice());
		System.out.println("address is:" +invoice3.getAddress());
		
		
		
	}
}

package javastudent;

public class Invoiveconstructetor {
	public static void main(String[] args){
		
		 Address invoice = new Address( "chaitanya","iphone",800.00,"Address","high street",802,94538,"fremont","ca");
		 Address invoice1 = new Address("vasu", "samsungphone", 500.00,"Adress","high street",802,94538,"fremont","ca");
		 Address invoice3 = new Address("krishna","nokia",800.00, "Address","high street",802,94538,"fremont","ca");
	
	
		     
		    
			System.out.println("name is:" +invoice.getName());
			System.out.println("item is:" +invoice.getItem());
			System.out.println("price is:" +invoice.getPrice());
			System.out.println("address is:" +invoice.getAddress());
			System.out.println("street is:" +invoice.getStreet());
			System.out.println("house no is:" +invoice.getHouseno());
			System.out.println("zipcode is:" +invoice.getZipcode());
			System.out.println("city is:" +invoice.getCity());
			System.out.println("--------------------------");
			System.out.println("name is:" +invoice1.getName());
			System.out.println("item is:" +invoice1.getItem());
			System.out.println("price is:" +invoice1.getPrice());
			System.out.println("address is:" +invoice1.getAddress());
			System.out.println("street is:" +invoice1.getStreet());
			System.out.println("house no is:" +invoice1.getHouseno());
			System.out.println("zipcode is:" +invoice1.getZipcode());
			System.out.println("city is:" +invoice1.getCity());
			System.out.println("--------------------------");
			System.out.println("name is:" +invoice3.getName());
			System.out.println("item is:" +invoice3.getItem());
			System.out.println("price is:" +invoice3.getPrice());
			System.out.println("address is:" +invoice3.getAddress());
			System.out.println("street is:" +invoice3.getStreet());
			System.out.println("house no is:" +invoice3.getHouseno());
			System.out.println("zipcode is:" +invoice3.getZipcode());
			System.out.println("city is:" +invoice3.getCity());
			
			
			
		}
	
}

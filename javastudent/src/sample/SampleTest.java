package sample;

public class SampleTest {
	public static void main(String[] args) {

		/*
		 * CustomerInvoice sale = new
		 * CustomerInvoice(address"chaitanya","iphone",800.00,"high street",802,
		 * 94538,"fremont","address"); CustomerInvoice firstsale = new
		 * CustomerInvoice("vasu", "samsungphone",
		 * 500.00,"high street",802,94538,"fremont"); CustomerInvoice secondsale
		 * = new
		 * CustomerInvoice("krishna","nokia",800.00,"high street",802,94538,
		 * "fremont");
		 * 
		 * System.out.println("name is:" +sale.getName());
		 * System.out.println("item is:" +sale.getItem());
		 * System.out.println("price is:" +sale.getPrice());
		 * System.out.println("street is:" +sale.getStreet());
		 * System.out.println("Address:"); System.out.println("house no is:"
		 * +sale.getHouseno()); System.out.println("zipcode is:"
		 * +sale.getZipcode()); System.out.println("city is:" +sale.getCity());
		 * System.out.println("--------------------------");
		 * System.out.println("name is:" + firstsale.getName());
		 * System.out.println("item is:" + firstsale.getItem());
		 * System.out.println("price is:" + firstsale.getPrice());
		 * System.out.println("Address:"); System.out.println("street is:" +
		 * firstsale.getStreet()); System.out.println("house no is:" +
		 * firstsale.getHouseno()); System.out.println("zipcode is:" +
		 * firstsale.getZipcode()); System.out.println("city is:" +
		 * firstsale.getCity());
		 * System.out.println("--------------------------");
		 * System.out.println("name is:" +secondsale.getName());
		 * System.out.println("item is:" +secondsale.getItem());
		 * System.out.println("price is:" +secondsale.getPrice());
		 * System.out.println("Address:"); System.out.println("street is:"
		 * +secondsale.getStreet()); System.out.println("house no is:"
		 * +secondsale.getHouseno()); System.out.println("zipcode is:"
		 * +secondsale.getZipcode()); System.out.println("city is:"
		 * +secondsale.getCity());
		 */

		Address addr = new Address("highstreet", 94538, 802, "fremont");
		CustomerInvoice c = new CustomerInvoice("chaitanya", "iphone", 800, "highstreet", 94538, 802, "fremont");
		System.out.println("name:" + c.getName() + "\n" + "item:" + c.getItem() + "\n" + "price:" + c.getPrice() + "\n"
				+ "street :" +addr.getStreet() + "\n" + "Houseno :" +addr .getHouseno() + "\n"
				+ "Zipcode:" + addr.getZipcode() + "\n" + "city:" + addr.getCity() + "");

	}
}

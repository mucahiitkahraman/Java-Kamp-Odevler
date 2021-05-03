import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager(null);
		 Date bDate = new Date (2001,06,26);
	     Customer customer = new Customer(1903,"Mücahit","Kahraman",bDate,"1903");
		 customerManager.save(customer);
		
	}

}

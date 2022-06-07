package inheritance;


public class Main {

	public static void main(String[] args) {
		IndvidualCustomer engin = new IndvidualCustomer();
		engin.customerNumber ="123";
		
		CorporateCustomer lmono = new CorporateCustomer();
		lmono.customerNumber = "555";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(engin);
		
		Customer[] customers = {engin, lmono};
		customerManager.addMultiple(customers);

		
		
	}

}


public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServicesAdaptor());
		customerManager.save(new Customer(1,"Mehmet Berkin","Yard�mc�",1998,"50305053584"));
		System.out.println();
	}
}

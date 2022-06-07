
public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	ICustomerCheckServices customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckServices customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save();
		}else {
			System.out.println("Not a valid person");
		}
	}

}


public abstract class BaseCustomerManager implements ICustomerServices {

	@Override
	public void save(Customer customer) {
		System.out.println("Save to db : " + customer.firstName);
		
	}

	public void save() {
		// TODO Auto-generated method stub
		
	}

}

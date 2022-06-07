
public abstract class BaseUserManager implements IUserServices{
	
	@Override
	public void register(User user) {
		System.out.println("Kay�t Ba�ar�l� : " + user.getFirstName() +" " + user.getLastName());
		
	}
	
	@Override
	public void delete(User user) {
		System.out.println( user.getFirstName() + " Adl� kullan�c� silindi " );
		
	}
	
	@Override
	public void update(String firstName, User user) {
		user.setFirstName(firstName);
		System.out.println( user.getFirstName() + " Adl� kullan�c� G�ncellendi " );
		
	}
	
}


public class User extends BaseUserManager{

	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String tcKimlikNo;
	
	
	public User(String firstName, String lastName, int dateOfBirth, String tcKimlikNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.tcKimlikNo = tcKimlikNo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getTcKimlikNo() {
		return tcKimlikNo;
	}


	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

}

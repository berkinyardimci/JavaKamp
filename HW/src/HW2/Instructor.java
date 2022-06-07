package HW2;

public class Instructor extends User {
	private int InstructorNumber;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String userName, int password, int InstructorNumber) {
		this.InstructorNumber = InstructorNumber;
	}

	public int getInstructorNumber() {
		return InstructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		InstructorNumber = instructorNumber;
	}
	 
}

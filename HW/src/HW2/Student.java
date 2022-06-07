package HW2;

public class Student extends User {
	private int studentNumber;
	
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String userName, int password, int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
}

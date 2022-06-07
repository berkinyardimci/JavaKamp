package HW2;

public class StudentManager extends UserManager {
	
	
	public void addStudent(Student student) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + " eklendi.");
	}
	public void updateStudent(Student student) {
		 System.out.println(student.getFirstName() + " " + student.getLastName() + " guncellendi.");
	}
}

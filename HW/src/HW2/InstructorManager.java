package HW2;

public class InstructorManager extends UserManager {
	
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " eklendi.");

	}
	public void updateInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " GÜNCELLENDÝ.");

	}
}

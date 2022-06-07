package HW2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Berkin","Yardımcı","memo",123);
		Student ogrenci1 = new Student(1,"Mehmet","Yardımcı","beko",123456,12354);
		Instructor egitmen1 = new Instructor(1,"Merdo","Bahar","mertooo",12345,188);
		
		
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.add(user1);
		String name = user1.getFirstName();
		System.out.println(name);
		user1.setFirstName("Ahmet");
		System.out.println(user1.getFirstName());
		userManager.update(user1);
		

	}

}

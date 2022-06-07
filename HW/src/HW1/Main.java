package HW1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Java Course","Backend");
		Course course2 = new Course(1,"Python Course","Backend");
		Course course3 = new Course(1,"JavaScript Course","Frontend");
		Course course4 = new Course();
		
		Course[] courses = {course1,course2,course3,course4};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		Teacher teacher1 = new Teacher("Berkin","Backend",24);
		Teacher teacher2 = new Teacher("Mert","Frontend",25);
		
		Teacher[] teachers = {teacher1,teacher2};
		
		for (Teacher teacher : teachers) {
			System.out.println(teacher.name);			
		}
		
		CourseManager courseManager1 = new CourseManager();
		courseManager1.joinCourse(course2);
		
		CourseManager courseManager2 = new CourseManager();
		courseManager2.breakCourse(course1);
	}

}

package HW1;

public class CourseManager {
	public void joinCourse(Course course){
		System.out.println("Seçtiğiniz : " +course.name + "e Katıldınız");
	}
	
	public void breakCourse(Course course ) {
		System.out.println(course.name +"'i Bıraktınız");
	}
}

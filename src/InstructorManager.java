
public class InstructorManager extends User{
	
	public void editCourseInstructor(Course course, String newInstructorName) {
		course.setInstructor(newInstructorName);
		System.out.println(course.getName()+" i�in yeni e�itmen ad�: "+ course.getInstructor());
		
	}
	public void editCourseName(Course course, String newCourseName) {
		System.out.print(course.getName()+" i�in yeni kurs ad�: ");
		course.setName(newCourseName);
		System.out.println(course.getName());
	}
}

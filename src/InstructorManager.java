
public class InstructorManager extends User{
	
	public void editCourseInstructor(Course course, String newInstructorName) {
		course.setInstructor(newInstructorName);
		System.out.println(course.getName()+" için yeni eðitmen adý: "+ course.getInstructor());
		
	}
	public void editCourseName(Course course, String newCourseName) {
		System.out.print(course.getName()+" için yeni kurs adý: ");
		course.setName(newCourseName);
		System.out.println(course.getName());
	}
}

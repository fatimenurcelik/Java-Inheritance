public class StudentManager extends User{
	
	public void addCourse(StudentManager stu,Course course) {
		System.out.println(stu.getName()+" i�in "+course.getName()+" eklendi.");
	}
	
	public void completeCourse(StudentManager stu , Course course) {
		System.out.println(stu.getName()+" "+course.getName()+"n� tamamlad�.");
	}
}

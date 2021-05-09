public class StudentManager extends User{
	
	public void addCourse(StudentManager stu,Course course) {
		System.out.println(stu.getName()+" için "+course.getName()+" eklendi.");
	}
	
	public void completeCourse(StudentManager stu , Course course) {
		System.out.println(stu.getName()+" "+course.getName()+"nı tamamladı.");
	}
}

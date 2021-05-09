
public class Course {
	String name;
	String instructor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public Course(String name, String instructor) {
		super();
		this.name = name;
		this.instructor = instructor;
	}
	
	
}

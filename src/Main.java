
public class Main {

	public static void main(String[] args) {
		Course cSharp = new Course("Yaz�l�m geli�tirme kamp�(C# + Angular)" ,"Engin Demirog");
		Course java = new Course("Yaz�l�m geli�tirme kamp�(Java + React)" ,"Engin Demirog");
		Course basic = new Course("Programlamaya giri� i�in temel kurs" ,"Engin Demirog");
		
		StudentManager stuMan= new StudentManager();
		stuMan.setName("fatime");
		stuMan.setEmail("fat@gmail.com");
		stuMan.setPassword("123456");
		stuMan.setSurname("celik");
		
		InstructorManager instMan= new InstructorManager();
		instMan.setName("engin");
		instMan.setEmail("eng@gmail.com");
		instMan.setPassword("45799");
		instMan.setSurname("demirog");
		
		stuMan.completeCourse(stuMan,cSharp);
		stuMan.addCourse(stuMan, java);
		instMan.editCourseInstructor(java,"murat");
		System.out.println(basic.getName());
		instMan.editCourseName(basic, "Ba�lang�� Kursu");
		System.out.println(basic.getName());
		
	}

}

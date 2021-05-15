package kodlama.io;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.id=1;
		student.name="Ali";
		student.accountType="student";
		
		
		Instructor instructor = new Instructor();
		instructor.id=3;
		instructor.accountType="instructor";
		instructor.name="Mehmet";
		instructor.salary=2.000;
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.login();
		studentManager.doHomework();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login();
		instructorManager.addCourse();

	}

}

package campExamples;

public class Course {
	public Course(int id,String name,String egitmen,double price) {
		this();
		this.id=id;
		this.name=name;
		this.egitmen=egitmen;
		this.price=price;
		
	}
	public Course() {
		
		System.out.println("Your course is here");
		
	}
	
	int id;
	String name;
	String egitmen;
	double price;

}

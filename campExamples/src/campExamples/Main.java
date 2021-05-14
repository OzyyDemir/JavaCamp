package campExamples;



public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id=1;
		course1.name="Java";
		course1.egitmen="Engin Demiroð";
		course1.price=0;
		
		Course course2 = new Course(2,"Python","Engin Demiroð",0);
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		Card myCard = new Card();
		myCard.id=1;
		myCard.name="Visa";
		myCard.limit=2.000;
		
		Profile profile = new Profile();
		profile.editProfile();
		profile.addCard(myCard);

	}

}
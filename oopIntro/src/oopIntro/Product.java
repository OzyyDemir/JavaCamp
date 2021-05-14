package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Çalýþtý");	
			
		}
	public Product(int id, String name, double UnitPrice, String detail) {
		this();
		this.id= id;
		this.name= name;
		this.UnitPrice=UnitPrice;
		this.detail=detail;
			
	}
	
	int id;
	String name;
	double UnitPrice;
	String detail;
	
}

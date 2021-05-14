package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product(1,"Lenovo V14",12.000,"16 GB RAM");
		
		Product product2= new Product();
		product2.id=2;
		product2.name="Lenovo V15";
		product2.UnitPrice=12.400;
		product2.detail="32 gb RAM";
		
		Product product3= new Product();
		product3.id=3;
		product3.name="Hp";
		product3.UnitPrice=12.600;
		product3.detail="8 gb RAM";
		
		Product[] products = {product1,product2,product3};
		for (Product product : products) {
			
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		Category category1= new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2= new Category();
		category2.id=2;
		category2.name="Bardak";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		
		
		
		
		
		
	}

}

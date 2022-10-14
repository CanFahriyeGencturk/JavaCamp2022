package javaCamp2022Day2Homework1ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// SOLID

		System.out.println("********************* Video 31 - 32 - 33 - 34 *********************");

		Product product1 = new Product(2, "Laptop", "LG Laptop", 200, 2, "Siyah");
		Product product = new Product();
		
		
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());
		System.out.println(product1.getKod());

		// productManager.Add2(2, "", "", 3, 220);

	}

}

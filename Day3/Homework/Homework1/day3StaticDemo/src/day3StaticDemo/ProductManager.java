package day3StaticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator();
		//isValid fonksiyonu ststic hale getirildi.
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		} else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
	}

}

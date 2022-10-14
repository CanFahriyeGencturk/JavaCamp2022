package day3StaticDemo;

//static => newlemeden classın adı ile fonksiyona ulaşmamızı sağlar.-> Uygulama sıfırlanana kadar bellekten atılmaz.
//Yardımcı araçlar static yapılabilir fakat claslar statici yapılmazlar

public class ProductValidator {
	static {
		System.out.println("Static yapıcı blok çalıştı");
	}
	
	//yapıcı bloklar newlendiğinde çalışır
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product){
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	/*
	//inner class
	public static class BaskaBirClass{
		public static void sil() {
			
		}
	}*/
}

package day3AbstractClasses;

public class Main {
	
	//Not : Abstract sınıflar kendi sınıflarını asla newlenemez tavsiye edilmez.

	public static void main(String[] args) {
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		womenGameCalculator.hesapla();
		womenGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomenGameCalculator();

	}

}

package odev1MiniProjeler;

public class loopDemo {
	public static void main(String[] args) {

		System.out.println("********************* Video 11 *********************");

		// For
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");

		System.out.println("********************* Video 12 *********************");

		// While
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("While Döngüsü Bitti");

		System.out.println("********************* Video 13 *********************");

		// Do-While = Şart uymasa bile bir kere çalışacaktır.
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("Do While Döngüsü Bitti");

	}
}

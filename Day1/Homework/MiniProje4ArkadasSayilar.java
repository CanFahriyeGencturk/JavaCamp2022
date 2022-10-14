package odev1MiniProjeler;

public class MiniProje4ArkadasSayilar {

	public static void main(String[] args) {
		
		System.out.println("********************* Video 22 *********************");


		// Arkadaş Sayilar => (220, 284), (1184, 1210), (2620, 2924), (5020, 5564)

		int number1 = 220;
		int number2 = 284;
		int total1 = 0, total2 = 0, remainder1 = 0, remainder2 = 0;

		for (int i = 1; i < number1; i++) {
			remainder1 = number1 % i;

			if (remainder1 == 0) {
				total1 = total1 + i;
			}

		}

		for (int j = 1; j < number2; j++) {
			remainder2 = number2 % j;

			if (remainder2 == 0) {
				total2 = total2 + j;
			}
		}

		if ((number1 == total2) && (number2 == total1)) {
			System.out.println(number1 + " ve " + number2 + " sayilari Arkadaş Sayilardir.");
		} else {
			System.out.println(number1 + " ve " + number2 + " sayilari Arkadaş Sayi değildir.");
		}

	}
}

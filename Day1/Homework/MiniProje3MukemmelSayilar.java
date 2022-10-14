package odev1MiniProjeler;

public class MiniProje3MukemmelSayilar {
	
	public static void main(String[] args) {

		System.out.println("********************* Video 21 *********************");

		
		// Mükemmel sayilar 6,28,496,8128
		
		int number = 8128;

		int total = 0;
		int remainder = 0;

		for (int i = 1; i <= number / 2; i++) {

			remainder = number % i;

			if (remainder == 0) {
				total = total + i;
			}

		}
		if (total == number) {
			System.out.println(number + " sayisi Mükemmel Sayidir");
		} else {
			System.out.println(number + " sayisi Mükemmel Sayi Deðildir.");
		}

	}

}

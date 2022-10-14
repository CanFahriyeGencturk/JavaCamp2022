package odev1MiniProjeler;

public class MiniProje1SayiAsalMi {

	public static void main(String[] args) {
		
		System.out.println("********************* Video 19 *********************");

		int number = 1;
		int remainder = number % 2;

		if (number == 2) {

			System.out.println(number + " sayisi asal sayidir");

		} else if (number == 1) {
			System.out.println(number + " sayisi asal sayi deðildir.");

		} else if (number < 1) {

			System.out.println("Asal sayi olabilmesi için 1 den büyük sayýlar girilmelidir.");
		} else {

			for (int i = 2; i <= number / 2; i++) {

				remainder = number % i;
				if (remainder == 0) {
					System.out.println(number + " sayisi asal sayi deðildir.");
					break;

				}
			}

			if (remainder != 0) {
				System.out.println(number + " sayisi asal sayidir");
			}
		}

	}

}

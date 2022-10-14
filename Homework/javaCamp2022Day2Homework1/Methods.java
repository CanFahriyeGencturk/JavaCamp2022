package javaCamp2022Day2Homework1;

public class Methods {
	
	public static void main(String[] args) {
		System.out.println("********************* Video 24 *********************");

		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = { 1, 2, 3, 4, 5, 8, 9, 0 };
		int aranacak = 16;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi == true) {
			mesajVer(aranacak + " sayisi sayilar arrayinde bulunmaktadır");

		} else {
			mesajVer(aranacak + " sayisi sayilar arrayinde bulunmamaktadır");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}
}

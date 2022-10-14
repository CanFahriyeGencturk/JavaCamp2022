package odev1MiniProjeler;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 1;
		boolean bulundu = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				bulundu = true;
				break;
			}
		}
		if (bulundu) {
			System.out.println(aranacak + " sayisi Arrayin içinde VAR");
		} else {
			System.out.println(aranacak + " sayisi Arrayin içinde YOK");
		}

	}

}

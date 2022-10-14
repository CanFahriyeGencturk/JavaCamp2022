package javaCamp2022Day2Homework1;

public class Methods2 {

	public static void main(String[] args) {

		System.out.println("********************* Video 25 - 26 *********************");

		String mesaj = "Bugun hava çok güzel";

		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int sayi = topla(15, 7);
		System.out.println(sayi);

		int toplam = topla2(2, 3, 4, 5, 2, 7, 5);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi.");

	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {

		return sayi1 + sayi2;

	}

	public static int topla2(int... sayilar) { // variable arguments like integer arrays
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;

	}

	public static String sehirVer() {

		return "Ankara";

	}

}

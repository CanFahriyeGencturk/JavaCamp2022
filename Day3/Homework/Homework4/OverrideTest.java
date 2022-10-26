package degerTipReferansTipDemo;

public class OverrideTest {

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}

	public static void main(String[] args) {
		int sonuc;

		sonuc = topla(3, 5);

		sonuc = topla(3, 5, 7);

	}

}

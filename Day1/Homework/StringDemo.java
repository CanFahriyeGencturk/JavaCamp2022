package odev1MiniProjeler;

public class StringDemo {
	public static void main(String[] args) {

		String mesaj = "Bug�n hava �ok g�zel."; // char array
		System.out.println(mesaj);

		System.out.println("********************* Video 17 *********************");

		System.out.println("Eleman say�s�� : " + mesaj.length());
		System.out.println("5. Eleman : " + mesaj.charAt(4));

		System.out.println(mesaj.concat(" Ya�as�n!"));
		System.out.println(mesaj);

		System.out.println(mesaj.startsWith("B")); // mesaj B ile ba�l�yorsa true dondurur (Case sensitive)
		System.out.println(mesaj.startsWith("?"));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // sonra indexi dahil etmiyor
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("va"));
		System.out.println(mesaj.lastIndexOf("a"));

		System.out.println("********************* Video 18 *********************");

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 4)); // son indexi dahil etmez

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);

		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); // ba��ndaki sonundaki bo�luklar� siler

	}

}

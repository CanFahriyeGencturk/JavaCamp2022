package odev1MiniProjeler;

public class MiniProje2KalinSesliVeInceSesliHarfler {
	public static void main(String[] args) {
		
		System.out.println("********************* Video 20 *********************");


		char harf = 'i';

		switch (harf) {
			case 'A':
			case 'a':
			case 'I':
			case 'ý':
			case 'O':
			case 'o':
			case 'U':
			case 'u': {
				System.out.println(harf + " harfi KALIN SESLÝ harftir");
				break;
			}
			case 'E':
			case 'e':
			case 'Ý':
			case 'i':
			case 'Ö':
			case 'ö':
			case 'Ü':
			case 'ü': {
				System.out.println(harf + " harfi ÝNCE SESLÝ harftir");
				break;
			}
			default: {
				System.out.println("Sesli harfler dýþýnda bir harf girildi.");
			}

		}
	}
}

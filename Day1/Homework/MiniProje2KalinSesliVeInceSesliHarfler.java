package odev1MiniProjeler;

public class MiniProje2KalinSesliVeInceSesliHarfler {
	public static void main(String[] args) {
		
		System.out.println("********************* Video 20 *********************");


		char harf = 'i';

		switch (harf) {
			case 'A':
			case 'a':
			case 'I':
			case '�':
			case 'O':
			case 'o':
			case 'U':
			case 'u': {
				System.out.println(harf + " harfi KALIN SESL� harftir");
				break;
			}
			case 'E':
			case 'e':
			case '�':
			case 'i':
			case '�':
			case '�':
			case '�':
			case '�': {
				System.out.println(harf + " harfi �NCE SESL� harftir");
				break;
			}
			default: {
				System.out.println("Sesli harfler d���nda bir harf girildi.");
			}

		}
	}
}

package odev1MiniProjeler;

public class SwitchDemo {

	public static void main(String[] args) {

		System.out.println("********************* Video 10 *********************");

		char grade = 'f';

		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
			case 'b':
				System.out.println("Çok Güzel : Geçtiniz");
				break;
			case 'C':
			case 'c':
				System.out.println("Ýyi : Geçtiniz");
				break;
			case 'D':
			case 'd':
				System.out.println("Fena Deðil : Geçtiniz");
				break;
			case 'F':
			case 'f':
				System.out.println("Maalesef Kaldýnýz");
				break;
			default:
				System.out.println("Geçersiz not girdiniz");

		}

	}

}

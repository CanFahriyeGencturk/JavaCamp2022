package odev1MiniProjeler;

public class SwitchDemo {

	public static void main(String[] args) {

		System.out.println("********************* Video 10 *********************");

		char grade = 'f';

		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("M�kemmel : Ge�tiniz");
				break;
			case 'B':
			case 'b':
				System.out.println("�ok G�zel : Ge�tiniz");
				break;
			case 'C':
			case 'c':
				System.out.println("�yi : Ge�tiniz");
				break;
			case 'D':
			case 'd':
				System.out.println("Fena De�il : Ge�tiniz");
				break;
			case 'F':
			case 'f':
				System.out.println("Maalesef Kald�n�z");
				break;
			default:
				System.out.println("Ge�ersiz not girdiniz");

		}

	}

}

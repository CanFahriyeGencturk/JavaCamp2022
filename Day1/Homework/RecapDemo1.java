package odev1MiniProjeler;

public class RecapDemo1 {
	
	public static void main(String[] args) {

		System.out.println("********************* Video 9 *********************");
		
		
		int sayi1 = 10;
		int sayi2 = 25;
		int sayi3 = 2;
		
		int tut;
		tut = sayi1;
		if( tut < sayi2) {
			tut = sayi2;
		}
		if(tut < sayi3) {
			tut = sayi3;
		}
		
		System.out.println("En Büyük Sayi : " + tut);
		

	}

}

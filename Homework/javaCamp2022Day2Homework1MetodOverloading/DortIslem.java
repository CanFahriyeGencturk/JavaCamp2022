package javaCamp2022Day2Homework1MetodOverloading;

public class DortIslem {
	
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public int topla(int sayi1, int sayi2,int sayi3) {
		return sayi1+sayi2+sayi3;
	}

	
	public int topla(double sayi1, int sayi2 ) {
		return (int) (sayi1+sayi2);
	}

	


}

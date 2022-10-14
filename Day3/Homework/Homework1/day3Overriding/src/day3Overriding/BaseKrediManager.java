package day3Overriding;

public class BaseKrediManager {
	//Override ediilmesine izin vermek istenmiyorsa "final" key wordu kullanılır
	//public final double hesapla() => gibi
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}

}

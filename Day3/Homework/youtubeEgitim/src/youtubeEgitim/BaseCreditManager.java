package youtubeEgitim;

public abstract class BaseCreditManager implements ICreditManager {

//Ortak operasyonları tutar. Tekrar edenleri içini bu claslarda doldurabiliriz
	//Bu opersyonların tamamlanmış ve tamamlanmmaışları tutar
	//Class özelliği gösterir -> Bir class sadece bir abstract class veya bir class extends edebilir 
	//Abstract classlar ve Interfaceler asla newlenemezler
	//Javada methodlar default olarak virtualdır. Yanı direk ezebiliriz.

	@Override
	public abstract void calculate();

	@Override
	public void save() {
		System.out.println("Kaydedildi");

	}
}

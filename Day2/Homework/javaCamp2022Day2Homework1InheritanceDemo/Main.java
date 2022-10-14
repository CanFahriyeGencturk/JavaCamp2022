package javaCamp2022Day2Homework1InheritanceDemo;

public class Main {

	// Bir class sadece bir classı extends(inheritance) edebilir
	public static void main(String[] args) {
		System.out.println("********************* Video 37 *********************");
		
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		
		krediUI.KrediHesapla(new TarimKrediManager());
		
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}

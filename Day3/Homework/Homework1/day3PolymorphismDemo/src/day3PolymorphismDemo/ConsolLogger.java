package day3PolymorphismDemo;

public class ConsolLogger  extends BaseLogger{
	public void log(String mesaj) {
		System.out.println("Logged to console : " + mesaj);
	}
}

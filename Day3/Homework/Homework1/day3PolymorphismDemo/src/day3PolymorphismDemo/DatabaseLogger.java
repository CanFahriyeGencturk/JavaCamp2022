package day3PolymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	public void log(String mesaj) {
		System.out.println("Logged to database : " + mesaj);
	}


}

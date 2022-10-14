package day3PolymorphismDemo;

public class FileLogger extends BaseLogger{
	
	public void log(String mesaj) {
		System.out.println("Logged to file : " + mesaj);
	}

}

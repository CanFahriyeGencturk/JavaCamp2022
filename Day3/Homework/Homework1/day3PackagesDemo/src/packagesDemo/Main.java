package packagesDemo;

import java.util.Scanner;

import matematik.DortIslem;
import matematik.Logaritma;

//Yukarıdaki şekil yada import matematik.* 0> matematik paketindeki herşeyi alır

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adınızı giriniz: ");
		
		String isim =  scanner.nextLine();
		
		System.out.println("Merhabab "+isim);
		
		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(2,3);
		
		Logaritma logaritma = new Logaritma();
		

	}

}

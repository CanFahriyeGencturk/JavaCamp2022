package day3HashMapDemo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("book", "kitap"); //book => anahtar, kitap => değer
		sozluk.put("table", "masa");
		sozluk.put("pencil", "kalem");
		sozluk.put("computer","bilgisayar");
		
		System.out.println(sozluk);
		System.out.println(sozluk.size());
		
		System.out.println("----------------------------------------");
		

		
		for(String item:sozluk.keySet()) {//akeyset => anahtaları alır
			System.out.println("Eleman :" + item + " Değer :"+sozluk.get(item));
		}
		
		
		
		
		System.out.println("-------------------------------------");
		
		sozluk.remove("table");
		System.out.println(sozluk.get("table"));
		
		System.out.println("-------------------------------------");
		sozluk.clear();
		System.out.println(sozluk);
		System.out.println(sozluk.size());
	}

}

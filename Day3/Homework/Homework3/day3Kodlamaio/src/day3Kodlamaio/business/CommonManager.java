package day3Kodlamaio.business;

import java.util.List;

public class CommonManager {
	
	public List<String> nameControl(String mesaj, List<String> nameList, String newName) throws Exception {

		if (!nameList.isEmpty()) {
			
			
			for (String name : nameList) {
				
				
				if (name.toLowerCase().equals(newName.toLowerCase())) {
					System.out.println("burda"+ name.toLowerCase() + " "+newName.toLowerCase());
					throw new Exception("Aynı isimle "+mesaj+" bulunmaktadır. Farklı bir isim veriniz!");
				}
			}
		}
		
				
		nameList.add(newName);
		return nameList;
	}

}

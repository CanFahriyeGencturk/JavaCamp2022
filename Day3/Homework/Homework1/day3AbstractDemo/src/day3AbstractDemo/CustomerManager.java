package day3AbstractDemo;

public class CustomerManager {
	//Strateji parterni
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
	}

}

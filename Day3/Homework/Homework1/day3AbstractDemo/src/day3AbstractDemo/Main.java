package day3AbstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		//Configürasyon kısmı
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();

	}

}

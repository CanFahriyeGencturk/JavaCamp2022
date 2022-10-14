package day3Interfaces;

public class Main {

	public static void main(String[] args) {

		//Not -> Interfacelerde abstractlar gibi newlenemezler
		//ICustomerDal customerDal = new ICustomerDal()
		
		ICustomerDal customerDal = new OracleCustomerDal();
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		
		
	}

}

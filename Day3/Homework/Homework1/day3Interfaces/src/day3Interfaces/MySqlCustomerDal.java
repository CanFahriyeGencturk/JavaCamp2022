package day3Interfaces;

public class MySqlCustomerDal implements ICustomerDal ,IRepository{
	//Dal -> Data Acess Layer
	
	@Override
	public void add() {
		System.out.println("My sql eklendi");
		
	}
	

}

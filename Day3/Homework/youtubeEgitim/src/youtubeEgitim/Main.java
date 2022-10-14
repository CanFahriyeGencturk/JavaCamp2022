package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
		// sonar qube
		// IoC Container
		// Interfacein amacı yazılımdaki bağımlılıkları gidermek , if karışıklığını
		// engellemektır

		// Bir sınıf sadece bir sınıfı extends edebilir fakat bir sınıfn birden fazla
		// interface i implemente edebilir
		
		//DRY -> Do not repeat yourself

		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
	}

}

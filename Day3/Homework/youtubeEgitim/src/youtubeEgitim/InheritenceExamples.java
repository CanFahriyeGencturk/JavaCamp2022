package youtubeEgitim;

public class InheritenceExamples {

	public static void main(String[] args) {
		// Katmanlı Mimariler
		// SOLID
		// S -> Single Responsibility

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.setId(1);

		CustomerManager customerManager = new CustomerManager(customer,new TeacherCreditManager());
		customerManager.save();
		customerManager.delete();

		Company company = new Company();
		company.setTaxNumber("10000");
		company.setCompanyName("Arçelik");
		company.setId(100);
		company.setCity("İstanbul");

		CustomerManager customerManager2 = new CustomerManager(company,new CarCreditManager());
		customerManager2.save();

		Person person = new Person();
		person.setNationalIdentity("1234");
		person.setFirstName("Can");
		person.setLastName("Fahriye");
		person.setCity("Ankara");
		person.setId(2);

		CustomerManager customerManager3 = new CustomerManager(person, new MilitaryCreditManager());
		customerManager3.save();

		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();

	}

}

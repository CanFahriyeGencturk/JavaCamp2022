package youtubeEgitim;

public class Customer {
	public int id;
	
	public String city;

	public Customer() {
		System.out.println("müşteri nesenesi başlatıldı");
	}

	public Customer(int id, String city) {
		
		this.id = id;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}

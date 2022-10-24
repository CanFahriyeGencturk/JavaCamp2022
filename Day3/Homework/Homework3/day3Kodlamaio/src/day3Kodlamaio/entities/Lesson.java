package day3Kodlamaio.entities;

public class Lesson {

	private int id;
	private String name;
	private int priceOfLesson;
	private Category category;

	public Lesson() {
		super();
	}

	public Lesson(int id, String name, int priceOfLesson , Category category) {
		super();
		this.id = id;
		this.name = name;
		this.priceOfLesson = priceOfLesson;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriceOfLesson() {
		return priceOfLesson;
	}

	public void setPriceOfLesson(int priceOfLesson) {
		this.priceOfLesson = priceOfLesson;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}

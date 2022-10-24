package day3Kodlamaio.entities;

public class Instructor {

	private int id;
	private String name;
	private String surname;
	private Lesson lesson;

	public Instructor() {
		super();
	}

	public Instructor(int id, String name, String surname, Lesson lesson) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.lesson = lesson;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

}

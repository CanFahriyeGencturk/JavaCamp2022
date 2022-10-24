package day3Kodlamaio.dataAccess.hibernate;

import day3Kodlamaio.dataAccess.InstructorDao;
import day3Kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	public void add(Instructor instructor) {
		System.out.println(instructor.getLesson().getName() + " Dersinin Eğitmeni " + instructor.getName() + " "
				+ instructor.getSurname() + " Hibernate ile veritabanına eklendi");
	}

}

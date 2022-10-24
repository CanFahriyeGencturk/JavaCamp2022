package day3Kodlamaio.dataAccess.jdbc;

import day3Kodlamaio.dataAccess.InstructorDao;
import day3Kodlamaio.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	public void add(Instructor instructor) {
		System.out.println(instructor.getLesson().getName() + " Dersinin Eğitmeni " + instructor.getName() + " "
				+ instructor.getSurname() + " JDBC ile veritabanına eklendi");
	}

}

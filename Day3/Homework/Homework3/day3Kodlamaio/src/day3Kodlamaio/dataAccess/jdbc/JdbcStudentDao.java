package day3Kodlamaio.dataAccess.jdbc;

import day3Kodlamaio.dataAccess.StudentDao;
import day3Kodlamaio.entities.Student;

public class JdbcStudentDao implements StudentDao {

	@Override
	public void add(Student student) {
		System.out.println("Öğrenci JDBC veritabanına eklendi : " + student.getName());
		
	}

}

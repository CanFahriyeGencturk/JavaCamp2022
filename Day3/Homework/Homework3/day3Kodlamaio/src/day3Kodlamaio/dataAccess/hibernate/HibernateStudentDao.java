package day3Kodlamaio.dataAccess.hibernate;

import day3Kodlamaio.dataAccess.StudentDao;
import day3Kodlamaio.entities.Student;

public class HibernateStudentDao implements StudentDao {

	@Override
	public void add(Student student) {
		System.out.println("Öğrenci HİBERNATE veritabanına eklendi : " + student.getName());

		
	}
	
}

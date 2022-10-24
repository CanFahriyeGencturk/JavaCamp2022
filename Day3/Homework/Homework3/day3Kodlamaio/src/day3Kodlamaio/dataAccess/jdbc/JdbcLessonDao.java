package day3Kodlamaio.dataAccess.jdbc;

import day3Kodlamaio.dataAccess.LessonDao;
import day3Kodlamaio.entities.Lesson;

public class JdbcLessonDao implements LessonDao {

	@Override
	public void add(Lesson lesson) {
		System.out.println("Ders JDBC veritabanına eklendi : " + lesson.getName());

		
	}

}

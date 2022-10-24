package day3Kodlamaio.dataAccess.hibernate;

import day3Kodlamaio.dataAccess.LessonDao;
import day3Kodlamaio.entities.Lesson;

public class HibernateLessonDao implements LessonDao{

	@Override
	public void add(Lesson lesson) {
		System.out.println("Ders HİBERNATE veritabanına eklendi : " + lesson.getName());
		
	}

}

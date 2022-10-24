package day3Kodlamaio;

import java.util.ArrayList;
import java.util.List;

import day3Kodlamaio.business.CategoryManager;
import day3Kodlamaio.business.InstructorManager;
import day3Kodlamaio.business.LessonManager;
import day3Kodlamaio.core.logging.DatabaseLogger;
import day3Kodlamaio.core.logging.FileLogger;
import day3Kodlamaio.core.logging.Logger;
import day3Kodlamaio.dataAccess.InstructorDao;
import day3Kodlamaio.dataAccess.LessonDao;
import day3Kodlamaio.dataAccess.hibernate.HibernateCategoryDao;
import day3Kodlamaio.dataAccess.hibernate.HibernateInstructorDao;
import day3Kodlamaio.dataAccess.hibernate.HibernateLessonDao;
import day3Kodlamaio.dataAccess.jdbc.JdbcInstructorDao;
import day3Kodlamaio.dataAccess.jdbc.JdbcLessonDao;
import day3Kodlamaio.entities.Category;
import day3Kodlamaio.entities.Instructor;
import day3Kodlamaio.entities.Lesson;

public class Main {

	public static void main(String[] args) throws Exception {
				
		//Kullanılacak loggerları ayarlama kısmı
		
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new DatabaseLogger());
		
		
		//Kategory isimlerinin listesi için bir array list. İlk aşamada kategoriler ekledim.
		
		List<String> categoryNameList = new ArrayList<>();
		
		Category category1 = new Category(1,"Programlama","Programlama Hakkında Eğitim");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		
		categoryNameList = categoryManager.addCategory(categoryNameList, category1);
		
		Category category2= new Category(1,"Veritabanı","Veritabanı Hakkında Eğitim");
		categoryNameList = categoryManager.addCategory(categoryNameList, category2);
		
		
		
		
		
		//Daha sonra o kategorilere uygun dersleri ekledim. Ders isimleri kontrolü için bir array list oluşturdum.
		
		List<String> lessonNameList = new ArrayList<>();
		
		List<Lesson> lessons = new ArrayList<>();
		lessons.add(new Lesson(1,"Java", 10,category1));
		lessons.add(new Lesson(2,"C++", 15,category1));
		lessons.add(new Lesson(3,"C#", 0,category1));
		lessons.add(new Lesson(4,"Sql", 0,category2));
		
		// aynı anda birden fazla  veritabanına yazma denemesi
		LessonDao lessonDaos[] = {new JdbcLessonDao()};
		
		LessonManager lessonManager = new LessonManager(lessonDaos, loggers); 
		
		for(Lesson lesson : lessons) {
			lessonNameList = lessonManager.addLesson(lesson, lessonNameList);
		}
		
		//Eklenen derslerin eğitmenlerinin ekleme kısmı
		
		
		List<Instructor> instructors = new ArrayList<>();
		instructors.add(new Instructor(1,"Engin", "Demiroğ",lessons.get(0)));
		instructors.add(new Instructor(2,"Can", "Fahriye",lessons.get(3)));
		
		InstructorDao instructorDaos[] = {new HibernateInstructorDao()};
		
		InstructorManager instructorManager = new InstructorManager(instructorDaos, loggers);
		
		for(Instructor instructor : instructors) {
			instructorManager.add(instructor);
		}
		
		
		
		
		
		
		
		
	}

}

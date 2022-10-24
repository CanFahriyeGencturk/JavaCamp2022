package day3Kodlamaio.business;

import java.util.List;

import day3Kodlamaio.core.logging.Logger;
import day3Kodlamaio.dataAccess.LessonDao;
import day3Kodlamaio.entities.Lesson;

public class LessonManager extends CommonManager {
	private LessonDao lessonDaos[];
	private List<Logger> loggers;

	public LessonManager(LessonDao[] lessonDaos, List<Logger> loggers) {
		this.lessonDaos = lessonDaos;
		this.loggers = loggers;
	}

	public List<String> addLesson(Lesson lesson, List<String> lessonNameList) throws Exception {
		lessonNameList = nameControl("KURS", lessonNameList, lesson.getName());
		priceControl(lesson.getPriceOfLesson());

		for (LessonDao lessonDao : lessonDaos) {
			lessonDao.add(lesson);
		}

		for (Logger logger : loggers) {
			logger.log(lesson.getName());
		}

		return lessonNameList;
	}

	public void priceControl(int price) throws Exception {
		if (price < 0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
		}
	}

}

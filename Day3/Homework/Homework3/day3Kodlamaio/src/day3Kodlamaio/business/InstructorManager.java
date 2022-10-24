package day3Kodlamaio.business;

import java.util.List;

import day3Kodlamaio.core.logging.Logger;
import day3Kodlamaio.dataAccess.InstructorDao;
import day3Kodlamaio.dataAccess.hibernate.HibernateInstructorDao;
import day3Kodlamaio.dataAccess.jdbc.JdbcInstructorDao;
import day3Kodlamaio.entities.Instructor;

public class InstructorManager {

	private InstructorDao[] instructorDaos;
	private List<Logger> loggers;

	public InstructorManager(InstructorDao[] instructorDaos, List<Logger> loggers) {

		this.instructorDaos = instructorDaos;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) throws Exception {

		for (InstructorDao instructorDao : instructorDaos) {
			instructorDao.add(instructor);
		}

		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}

	}

}

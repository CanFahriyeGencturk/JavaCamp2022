package day3Kodlamaio.business;

import java.util.List;

import day3Kodlamaio.core.logging.Logger;
import day3Kodlamaio.dataAccess.StudentDao;

public class StudentManager {
	
	private StudentDao studentDao;
	private List<Logger> loggers;
	
	
	public StudentManager(StudentDao studentDao, List<Logger> loggers) {
		super();
		this.studentDao = studentDao;
		this.loggers = loggers;
	}
	
	
	
	
	

}

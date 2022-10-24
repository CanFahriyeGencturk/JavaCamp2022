package day3Kodlamaio.business;

import java.util.List;

import day3Kodlamaio.core.logging.Logger;
import day3Kodlamaio.dataAccess.CategoryDao;
import day3Kodlamaio.entities.Category;

public class CategoryManager extends CommonManager{

	private CategoryDao categoryDao;
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public List<String>  addCategory(List<String> categoryNameList, Category category) throws Exception {
		
		categoryNameList = nameControl("KATEGORİ", categoryNameList, category.getName());
		categoryDao.add(category);
		for(Logger logger : loggers) {
			logger.log(category.getName());
		}
		
		return categoryNameList;
	}
	

	

}

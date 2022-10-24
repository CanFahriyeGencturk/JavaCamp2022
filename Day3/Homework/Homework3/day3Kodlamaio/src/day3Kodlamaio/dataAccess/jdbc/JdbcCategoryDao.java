package day3Kodlamaio.dataAccess.jdbc;

import day3Kodlamaio.dataAccess.CategoryDao;
import day3Kodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Category JBDC veritabanına eklendi : " + category.getName());
		
	}

}

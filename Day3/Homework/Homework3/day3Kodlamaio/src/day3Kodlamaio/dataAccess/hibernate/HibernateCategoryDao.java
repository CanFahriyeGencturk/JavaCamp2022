package day3Kodlamaio.dataAccess.hibernate;

import day3Kodlamaio.dataAccess.CategoryDao;
import day3Kodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category HİBERNATE veritabanına eklendi : " + category.getName());
		
	}

}

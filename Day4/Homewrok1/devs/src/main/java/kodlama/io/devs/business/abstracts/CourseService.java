package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concrete.Course;

public interface CourseService {
	List<Course> getAll();

	List<Course> add(Course course);

	List<Course> deleteById(int id) throws Exception;

	List<Course> updateById(int id, String newCourseName) throws Exception;

	Course findById(int id) throws Exception;

	Course findByName(String courseName);

	boolean sameNameIsExist(String newCourseName) throws Exception;

	boolean courseNameIsNull(Course course) throws Exception;

	List<Course> addCourse(Course course) throws Exception;

}

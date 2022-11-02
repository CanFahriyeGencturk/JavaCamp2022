package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concrete.Course;

public interface CourseRepository {

	List<Course> getAll();

	List<Course> add(Course course);

	List<Course> deleteById(int id);

	List<Course> updateById(int id, String newCourseName);

	Course findById(int id);

	Course findByName(String courseName);

}

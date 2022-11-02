package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.CourseRepository;
import kodlama.io.devs.entities.concrete.Course;

@Repository
public class InMemoryCourseRepository implements CourseRepository {

	List<Course> courses;

	@Autowired
	public InMemoryCourseRepository() {
		courses = new ArrayList<Course>();
		courses.add(new Course(1, "C#"));
		courses.add(new Course(2, "Java"));
		courses.add(new Course(3, "Python"));
		courses.add(new Course(4, "C++"));
	}

	@Override
	public List<Course> getAll() {
		return courses;
	}

	@Override
	public List<Course> add(Course course) {
		courses.add(course);
		return courses;
	}

	@Override
	public List<Course> deleteById(int id) {

		for (Course course : courses) {
			if (course.getId() == id) {
				courses.remove(id - 1);
				break;
			}
		}

		return courses;
	}

	@Override
	public List<Course> updateById(int id, String newCourseName) {
		for (Course course : courses) {
			if (course.getId() == id) {
				course.setName(newCourseName);
				break;
			}
		}

		return courses;
	}

	@Override
	public Course findById(int id) {
		for (Course course : courses) {
			if (course.getId() == id) {
				return course;
			}
		}
		return null;
	}

	@Override
	public Course findByName(String courseName) {
		for (Course course : courses) {
			if (courseName.toLowerCase().equals(course.getName().toLowerCase())) {
				return course;
			}
		}
		return null;
	}

}

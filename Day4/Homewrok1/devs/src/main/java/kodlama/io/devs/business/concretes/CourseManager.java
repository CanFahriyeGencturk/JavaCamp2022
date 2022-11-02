package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.CourseService;
import kodlama.io.devs.dataAccess.abstracts.CourseRepository;
import kodlama.io.devs.entities.concrete.Course;

@Service
public class CourseManager implements CourseService {

	private CourseRepository courseRepository;

	@Autowired
	public CourseManager(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> getAll() {
		return courseRepository.getAll();
	}

	@Override
	public List<Course> add(Course course) {
		return courseRepository.add(course);
	}

	@Override
	public List<Course> deleteById(int id) throws Exception {
		findById(id);
		return courseRepository.deleteById(id);

	}

	@Override
	public List<Course> updateById(int id, String newCourseName) throws Exception {
		findById(id);
		sameNameIsExist(newCourseName);
		return courseRepository.updateById(id, newCourseName);
	}

	@Override
	public Course findById(int id) throws Exception {
		Course varMi = courseRepository.findById(id);
		if (varMi != null) {
			return varMi;
		} else {
			throw new Exception(id + " nolu id'ye sahip kurs bulunmamaktdır");
		}

	}

	@Override
	public Course findByName(String courseName) {
		Course varMi = courseRepository.findByName(courseName);
		if (varMi != null) {
			return varMi;
		} else {
			return null;
		}

	}

	@Override
	public boolean sameNameIsExist(String newCourseName) throws Exception {
		Course varMi = findByName(newCourseName);
		if (varMi == null) {
			return true;
		} else {
			throw new Exception(newCourseName + " isme sahip kurs bulunmaktadır.Lütfen farklı bir isim giriniz!");
		}

	}

	@Override
	public boolean courseNameIsNull(Course course) throws Exception {
		String tut = course.getName().replaceAll(" ", "");

		if (tut.equals("") || tut.equals(null)) {
			throw new Exception("Kurs ismi boş geçilmez");
		} else {
			course.setName(course.getName().trim());
		}
		return true;
	}

	public List<Course> addCourse(Course course) throws Exception {

		if (sameNameIsExist(course.getName()) && courseNameIsNull(course)) {
			return add(course);
		} else {
			throw new Exception(course.getName() + " isme sahip kurs bulunmaktadır.Lütfen farklı bir isim giriniz!");
		}

	}

}

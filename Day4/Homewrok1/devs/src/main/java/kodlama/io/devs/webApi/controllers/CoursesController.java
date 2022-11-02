package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.CourseService;
import kodlama.io.devs.entities.concrete.Course;

@RestController
@RequestMapping("/api/courses")
public class CoursesController {

	private CourseService courseService;

	@Autowired
	public CoursesController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	@GetMapping("/getall")
	public List<Course> getAll(){
		return courseService.getAll();
	}
	
	@GetMapping("/findbyid")
	public Course findById(int id) throws Exception {
		return courseService.findById(id);
	}
	
	@GetMapping("/findbyname")
	public Course findByName(String courseName) {
		return courseService.findByName(courseName);
	}
	
	@GetMapping("/samenameexist")
	public boolean sameNameIsExist(String courseName) throws Exception {
		return courseService.sameNameIsExist(courseName);
	}
	
	
	@GetMapping("/addcourse")
	public List<Course> addCourse(Course course) throws Exception{
		return courseService.addCourse(course);
		
	}
	
	@GetMapping("/deletebyid")
	public List<Course> deleteById(int id) throws Exception{
		return courseService.deleteById(id);
	}
	
	@GetMapping("/updatebyname")
	public List<Course> updateById(int id, String newCourseName) throws Exception { 
		return courseService.updateById(id, newCourseName);
	}
	
}

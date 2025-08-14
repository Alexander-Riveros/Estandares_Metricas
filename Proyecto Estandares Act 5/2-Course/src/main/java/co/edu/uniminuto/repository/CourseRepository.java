package co.edu.uniminuto.repository;

import java.util.ArrayList;
import java.util.List;
import co.edu.uniminuto.entitys.Course;

public class CourseRepository {
	
	private List<Course> listCourse = new ArrayList<>();
	
	public CourseRepository() {
		this.listCourse.add(new Course(1,"JAVA",20));
		this.listCourse.add(new Course(1,"JAVA",20));
		this.listCourse.add(new Course(1,"JAVA",20));
		this.listCourse.add(new Course(1,"JAVA",20));
		this.listCourse.add(new Course(1,"JAVA",20));
	}

}

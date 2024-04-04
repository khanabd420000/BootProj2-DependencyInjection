package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {

	@Autowired
	@Qualifier("java")        
//  @Qualifier("${course.choose}")	  XXX
	private CourseMaterial material;
	public void preparation(String examName) {
		String courseContent = material.courseContent();
		double coursePrice = material.coursePrice();
		System.out.println("Exam preparation is going on using "+courseContent+" of price "+coursePrice);
	}
}

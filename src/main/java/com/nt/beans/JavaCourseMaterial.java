package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterial implements  CourseMaterial{

	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial::Constructor");
	}
	
	@Override
	public String courseContent() {
        System.out.println("Java course materials");		
		return "Core Java,Adv. Java....";
	}

	@Override
	public double coursePrice() {
		System.out.println("Java course price");
		return 3000.0 ;
	}

}

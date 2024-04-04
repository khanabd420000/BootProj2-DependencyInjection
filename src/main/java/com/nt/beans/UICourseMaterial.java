package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("ui")
public class UICourseMaterial implements CourseMaterial{

	public UICourseMaterial() {
		System.out.println("UICourseMaterial::Constructor");
	}
	
	@Override
	public String courseContent() {
		// TODO Auto-generated method stub
		return "html,css,js,angular etc";
	}

	@Override
	public double coursePrice() {
		// TODO Auto-generated method stub
		return 5000.0;
	}

}

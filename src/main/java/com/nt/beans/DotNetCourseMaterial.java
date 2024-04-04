package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dotNet")
@Primary
public class DotNetCourseMaterial implements CourseMaterial{

	
	public  DotNetCourseMaterial() {
		System.out.println(" DotNetCourseMaterial::Constructor");
	}
	
	@Override
	public String courseContent() {
		// TODO Auto-generated method stub
		return "c# oops,exception handlind...etc";
	}

	@Override
	public double coursePrice() {
		// TODO Auto-generated method stub
		return 4000.0;
	}

}

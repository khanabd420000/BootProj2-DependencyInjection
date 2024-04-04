package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.Student;

@SpringBootApplication
public class BootProj2DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootProj2DependencyInjectionApplication.class, args);
		Student bean = context.getBean(Student.class);
		bean.preparation("Cts-java Interview");
		
		context.close();
	}

}

package com.example.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DemoDAO demoDao = context.getBean(DemoDAO.class);
		demoDao.insertDemo("Hello", "787897980");
	}

}

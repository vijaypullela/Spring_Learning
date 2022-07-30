package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/example/app/config.xml");
		
		Sim sim = context.getBean("sim",Sim.class);
		sim.call();
		sim.data();
	}

}

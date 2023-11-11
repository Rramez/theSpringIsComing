package com.example.thespringiscoming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.GracefulShutdownCallback;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Thespringiscoming {

	public static void main(String[] args) {
		ApplicationContext myApp = SpringApplication.run(Thespringiscoming.class, args);
		Jcpc ramez = myApp.getBean(Jcpc.class);

	}

}

package com.sbproject.SprintBootP02;

import com.sbproject.SprintBootP02.beans.Instagram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprintBootP02Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SprintBootP02Application.class, args);
		Instagram bean = context.getBean(Instagram.class);
		bean.play();

	}

}

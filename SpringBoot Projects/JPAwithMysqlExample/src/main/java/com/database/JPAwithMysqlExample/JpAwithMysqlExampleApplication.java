package com.database.JPAwithMysqlExample;

import com.database.JPAwithMysqlExample.dao.UserReposiroty;
import com.database.JPAwithMysqlExample.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpAwithMysqlExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JpAwithMysqlExampleApplication.class, args);
		UserReposiroty userRepository=context.getBean(UserReposiroty.class);

//		User user1=new User();
//
//		user1.setName("Arjun ");
//		user1.setStatus("Python Programmer");
//		user1.setCity("Nashik");
//
//		User user2=new User();
//
//		user2.setName("Dharmaesh yadav");
//		user2.setCity("Vrindawan");
//		user2.setStatus(".Net developer");
//
////		User u1=userRepository.save(user1);
//
//		List<User> userss=List.of(user1,user2);
//		Iterable<User> result=userRepository.saveAll(userss);
//
//		result.forEach(user->{
//			System.out.println("Saved users :"+user);
//		});
////		System.out.println("Saved object is :"+u1);


//		Optional<User> optional=userRepository.findById(52);
//		User user= optional.get();
//
//		user.setName("Ankit Tiwari");
//		User result=userRepository.save(user);
//
//		System.out.println(result);

		//How to get the data
//		Iterable<User> itr=userRepository.findAll();
//		itr.forEach(user-> {System.out.println(user);});

		//Deleting single user from database
		userRepository.deleteById(53);

		//Deleting multiple users from database

		Iterable<User> allusers=userRepository.findAll();

		allusers.forEach(user -> System.out.println(user));

		userRepository.deleteAll(allusers);
	}

}

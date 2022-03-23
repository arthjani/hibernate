package com.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.dto.UserDetails;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
		
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("First User Arth");
		

		
		
		
		
		/*
		  
		 1. configure the sessionFactory and session in java program.
		 2. Example given below. 
		 
	
		//new configuration object read the configure file and build the sessionFactory 
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//where sessionFactory have sessions
		//openSession method open the new session we use the session object to save the model objects
		//before that i have to begin the transaction
		Session session = sessionFactory.openSession();
		
		//i can save the objects inside this transaction 
		session.beginTransaction();
		
		//save the user objects
		session.save(user);
		
		//for ending the transaction first get the transaction and then commit 
		session.getTransaction().commit();
		
		*/
		
		
	}

}

package com.hibernate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.dto.Address;
import com.hibernate.dto.UserDetails;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
		
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("First User Arth");
		
		Address addr = new Address();
		
		addr.setStreet("street name");
		addr.setCity("city name");
		
		//user.setHomeAddress(addr);
		

		
	
		
		
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
		session.close();
		user = null;
		 
		//open the another session and but we don't have to create another sessionFactory because it is expensive call.
		session = sessionFactory.openSession();
		session.beginTransaction();
		//object of the UserDetails class we want to retrieve with primary key 1.
		user =(UserDetails)session.get(UserDetails.class,1);
		
		*/
		
		
	}

}

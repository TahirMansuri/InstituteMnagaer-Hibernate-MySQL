package com.infogalaxy.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateApp {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Course.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Course course = session.get(Course.class, 101);
		
		course.setCname("C Language");
		
		session.beginTransaction();
		session.update(course);
		session.getTransaction().commit();
		
	}
	
}

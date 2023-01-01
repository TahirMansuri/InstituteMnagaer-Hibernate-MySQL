package com.infogalaxy.hibernatedemo.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infogalaxy.hibernatedemo.entity.Course;

public class HibernateUtils {
	
	public static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        configuration.addAnnotatedClass(Course.class);
	       
	        sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}
	
}

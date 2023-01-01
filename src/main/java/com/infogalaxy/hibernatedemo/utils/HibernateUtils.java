package com.infogalaxy.hibernatedemo.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infogalaxy.hibernatedemo.entity.Course;

public class HibernateUtils {

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Course.class);
        
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}
	
}

package com.infogalaxy.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infogalaxy.hibernatedemo.entity.Course;
import com.infogalaxy.hibernatedemo.utils.HibernateUtils;

public class UpdateApp {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Course course = session.get(Course.class, 101);
		
		course.setCname("C Language");
		
		session.beginTransaction();
		session.update(course);
		session.getTransaction().commit();
		
	}
	
}

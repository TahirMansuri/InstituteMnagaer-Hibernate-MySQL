package com.infogalaxy.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

/**
 * Hello world!
 *
 */
public class CreateApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Course.class);
        
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Course course = new Course();
        
        course.setCid(103);
        course.setCname("Java");
        course.setCfees("6000");
        
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();
        
        System.out.println("Data Saved...");
        
    }
}

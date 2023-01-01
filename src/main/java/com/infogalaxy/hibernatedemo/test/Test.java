package com.infogalaxy.hibernatedemo.test;

import org.hibernate.SessionFactory;

import com.infogalaxy.hibernatedemo.utils.HibernateUtils;

public class Test {

	public static void main(String[] args) {
		//Checking for 2 different SessionFactory Object, they are created separately
		SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();
		
		SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();
		
		System.out.println(sessionFactory1 +" - "+ sessionFactory2);
	}
	
}

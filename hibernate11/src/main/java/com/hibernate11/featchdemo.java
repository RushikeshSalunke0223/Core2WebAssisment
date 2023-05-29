package com.hibernate11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class featchdemo {
	public static void main(String[] args) {
		//get or load.
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		Session session = factory.openSession();
		Student student = (Student)session.load(Student.class, 101);
		
		Session session1 = factory.openSession();
		Student student1 = (Student)session1.load(Student.class, 101);
		
		System.out.println(student);
		System.out.println(student1);
		
		
		Address add=session.get(Address.class, 1);
		System.out.println(add.getStreet()+" : "+add.getCity()+" : "+add.getAddeDate());
		
		Address add1=session.load(Address.class, 1);
		System.out.println(add1.getStreet()+" : "+add1.getCity()+" : "+add1.getAddeDate());
		
		session.close();
		factory.close();
	}

}

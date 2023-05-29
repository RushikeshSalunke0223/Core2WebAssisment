package com.hibernate11;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class emdDEmo {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student s1=new Student();
		s1.setId(101);
		s1.setNameString("Rushikesh Salunke");
		s1.setCityString("Pune Dehugoan");
		
		Certificate c1=new Certificate();
		c1.setCourse("Java Backend Course");
		c1.setDuration("04 Months");
		s1.setCertificate(c1);
		
		Student s2=new Student();
		s2.setId(102);
		s2.setNameString("shhubham beldar");
		s2.setCityString("Pune Dehugoan");
		
		Certificate c2=new Certificate();
		c2.setCourse("python  Course");
		c2.setDuration("03 Months");
		s2.setCertificate(c2);
		
		Session session=factory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		
		beginTransaction.commit();
		session.close();
		factory.close();

	}

}

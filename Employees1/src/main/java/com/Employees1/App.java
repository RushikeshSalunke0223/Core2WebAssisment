package com.Employees1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("project starting from here......");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating Employees Object class.
		Employee emp = new Employee();
		emp.setId(8);
		emp.setName("Shrenuu srinivas");
		emp.setCity("tamilnaduu");
		
		// Creating department object class,
		dipartment dp= new dipartment();
		dp.setId(8);
		dp.setName("texttile buisness");
		dp.setOpen(true);
		

		Session currentSession = factory.openSession();
		Transaction beginTransaction = currentSession.beginTransaction();
		currentSession.save(emp);
		currentSession.save(dp);
		beginTransaction.commit();
		currentSession.close();
		factory.close();
		
	}
}

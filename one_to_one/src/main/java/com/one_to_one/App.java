package com.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/one_to_one/hibernate.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Employee e1 = new Employee();
		e1.setName("Rusikesh salunke");

		Employee e2 = new Employee();
		e2.setName("shubham Beldar");

		Passport p1 = new Passport();
		p1.setCountry_name("Japan");
		e1.setPassport(p1);
		p1.setEmployee(e1);
		
		Passport p2 = new Passport();
		p2.setCountry_name("UK");
		e2.setPassport(p2);
		p2.setEmployee(e2);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(p1);
		session.save(e1);
		session.save(p2);
		session.save(e2);

		transaction.commit();
		session.close();
		factory.close();

	}
}

package com.Employees1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class featchdatademo {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Employee employee=session.load(Employee.class, 1);
		
		Employee emp=session.get(Employee.class, 2);
		System.out.println(emp);
		System.out.println(employee);
		
		session.close();
		factory.close();

	}

}

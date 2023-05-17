package com.hibernate11;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Student std = new Student();
		std.setId(101);// always change id before run program.
		std.setNameString("shubham beldar");
		std.setCityString("Baramati");
		
		Address address=new Address();
		address.setStreet("yelwadi road");
		address.setCity("dehu");
		address.setOpen(true);
		address.setAddeDate(new java.util.Date());
		address.setX(0);
		
		@SuppressWarnings("resource")
		FileInputStream file=new FileInputStream("src/main/java/rushi.png");
		byte[] data=new byte[file.available()];
		file.read(data);
		address.setImage(data);

		Session currentSession = factory.openSession();
		Transaction beginTransaction = currentSession.beginTransaction();
		currentSession.save(std);
		currentSession.save(address);
		beginTransaction.commit();
		currentSession.close();
		System.out.println("done");
		factory.close();

		System.out.println(std);
		System.out.println(factory.isClosed());
	}
}

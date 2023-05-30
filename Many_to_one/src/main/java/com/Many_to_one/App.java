package com.Many_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure("com/Many_to_one/hibernate.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       
       //students 1
       Students s1=new Students();
       s1.setName("Rushikesh Salunke");
       s1.setCourse("EDU-bridge Java Full Satck course");
       
       //student 2
       Students s2=new Students();
       s2.setName("Pranav Khoat");
       s2.setCourse("EDU-bridge Java Full Satck course");
      
       //Trainer 1
       Trainner t1=new Trainner();
       t1.setName("Jayanth V sir");
       t1.setSubject("Java Fullstack");
       s1.setTrainner(t1);
       s2.setTrainner(t1);
       
       //student 3
       Students s3=new Students();
       s3.setName("Megha Falke");
       s3.setCourse("EDU-bridge Apptitude couse");
       
       //student 4
       Students s4=new Students();
       s4.setName("Rushikesh Gawade");
       s4.setCourse("EDU-bridge Apptitude class");
      
       //Trainer 2
       Trainner t2=new Trainner();
       t2.setName("Sai Pallavi ma'am");
       t2.setSubject("Apptitude math's");
       s3.setTrainner(t2);
       s4.setTrainner(t2);
       
       Session session = factory.openSession();
       Transaction transaction = session.beginTransaction();
       
       //saving students.1 and 2
       session.save(s1);
       session.save(s2);
       
       //saving trainer.1
       session.save(t1);
       
       //saving students.3 and 4
       session.save(s3);
       session.save(s4);
       
       //saving trainer.2
       session.save(t2);
       
       transaction.commit();
       session.close();
       factory.close();
       
    }
}

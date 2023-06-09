package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {

		System.out.println("line 1");
		Configuration configuration = new Configuration(); // creating configuration object
		System.out.println("line 2");
		configuration.configure("hibernate.cfg.xml"); // this method is used to load cfg file
		// step-2
		System.out.println("line 3");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// step-3
		Session session = sessionFactory.openSession();

		// step-4
		Transaction transaction = session.beginTransaction();

		// insert data into database
		Student student = new Student();

		// how to set the value into object student
		// student.setId(10);
		student.setFirstName("laxman");
		student.setLastName("pawar");

		session.save(student);

		session.close();
		System.out.println("Record saved successfully...");

	}

}

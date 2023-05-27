package com.demo;

import java.util.List;

import org.hibernate.Query;
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

		//Student student = new Student();
		

		/* ******For session level chache ****************
		// insert data into database
		Student student = new Student();
		Student student2 = new Student();
		// how to set the value into object student
		// student.setId(10);
		student.setFirstName("Aadesh");
		student.setLastName("More");
		student2.setFirstName("vaibhav");
		student2.setLastName("kasar");

		session.save(student);
		session.save(student2);
		System.out.println("Record saved successfully..."); 
		Student student3 = session.get(Student.class, 1);
		System.out.println("id >>" + student3.getId());
		System.out.println("fname >>" + student3.getFirstName());
		System.out.println("lname >> "+ student3.getLastName());
		System.out.println("Record 1 fetched");
		
		Student student4 = session.get(Student.class, 2);
		System.out.println("id >>" + student4.getId());
		System.out.println("fname >>" + student4.getFirstName());
		System.out.println("lname >> "+ student4.getLastName());
		System.out.println("Record 2 fetched");*/
		

		Query<Student> query = session.createQuery("FROM Student");
		query.setCacheable(false);
		List<Student> list = query.list();
		for (Student stud : list) {
			System.out.println("id >> " + stud.getId());
			System.out.println("fname >> " + stud.getFirstName());
			System.out.println("lname >> " + stud.getLastName());
		}
		
		Student student4 = session.get(Student.class, 5);
		System.out.println("id >>" + student4.getFirstName());
		
		
		
	
		
		
		
		
		
		
		//session.save(student);
		// session.save(employee);
		transaction.commit();
		session.close();
		
	}
}

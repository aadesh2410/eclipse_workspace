package com.hibdemo;

//import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {
		
		//Step-1
		//creating configuration object which will help to build seesion factory
		Configuration configure = new Configuration();
		
		//Step-2
		//pass on the cfg file to configure the details
		configure.configure("hibernate.cfg.xml");
		
		//Step-3
		//building the session factory, which will help to build multiple sessions
		SessionFactory sessionFactory = configure.buildSessionFactory();
		

		
		//Step-4
		//basic unit of hibernate framework
		//physical connection with database is created here.
		Session session = sessionFactory.openSession();
		
		//Step-5
		Transaction transaction = session.beginTransaction();
		
		
		//perfoming the insert operation onto database using save method and session object
		Employee employee = new Employee();
		employee.setName("John");
		employee.setEmpId(69);
		employee.setSalary(150000);
		employee.setCity("Los Angeles");
		session.save(employee);
		
		Employee employee2 = new Employee();
		employee2.setName("Ben");
		employee2.setEmpId(96);
		employee2.setSalary(250000);
		employee2.setCity("San Fransisco");
		
		session.save(employee2);
		
		session.close();
		
	}
}

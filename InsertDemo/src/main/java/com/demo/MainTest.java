package com.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
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
		student.setFirstName("Aadesh");
		student.setLastName("More");
		
		Employee employee = new Employee();
		employee.setName("Vaibhav");
		employee.setCity("Pune");

//		//update operation
//		//step-1: fetch required record
//		Student student=session.get(Student.class, 2);
//		//step-2: edit the record
//		student.setFirstName("Pawan");
//		student.setLastName("Unde");
//		//step-3: update back to the db
//		session.update(student);
//		

//		// delete operation
//		// step-1:fetch the particular record
//		Student student2 = session.get(Student.class, 2);
//		// step-2:delete
//		session.delete(student2);

		// fetching all records
//		@SuppressWarnings("unchecked")
//		Query<Student> query = session.createQuery("FROM Student");
//		List<Student> list=query.list();
//		for (Student student : list) {
//			System.out.println("id >> " + student.getId());
//			System.out.println("fname >> " + student.getFirstName());
//			System.out.println("lname >> " + student.getLastName());
//		}
		
		session.save(student);
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.println("Record saved successfully...");
	}
}

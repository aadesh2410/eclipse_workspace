package com.test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialization {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\NewDoc.txt");
			ois = new ObjectInputStream(fis);
			Object object = ois.readObject();
			Student student1 = (Student) object;
			System.out.println("First name of student >> " + student1.getName());
			System.out.println("Last name of student >> " + student1.getLastName());
			System.out.println("Student city name is >>" + student1.getCity());
			System.out.println("Deserialization of Student finished");
			System.out.println("Marks >> " + student1.getMarks());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
			ois.close();
		}
	}

}

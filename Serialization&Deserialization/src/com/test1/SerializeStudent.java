package com.test1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {

	public static void main(String[] args) throws IOException {

		Student student = new Student();
		student.setName("Aadesh");
		student.setLastName("More");
		student.setCity("Pune");
		student.setMarks(35);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\NewDoc.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(student);

			System.out.println("serialization of student done");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fos.close();
			oos.close();
		}
	}
	
}

package com.demoofinheritance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemoClass {

	public static void main(String[] args) throws IOException {

		// FileInputStream fis= null;
		ObjectInputStream ois = null;

		try {

			// fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\OutputFile.txt")
			ois = new ObjectInputStream(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA IODemo files\\OutputFile.txt"));

			DemoClass demoClass2 = (DemoClass) ois.readObject();
			System.out.println("Deserialization of democlass object completed");
			System.out.println(demoClass2.a);
			System.out.println(demoClass2.b);
			System.out.println(demoClass2.c);
			System.out.println(demoClass2.getEmployeeCity());
			System.out.println(demoClass2.getEmployeeName());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ois.close();
		}
	}

}

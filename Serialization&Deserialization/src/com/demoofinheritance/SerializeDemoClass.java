package com.demoofinheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeDemoClass {

	public static void main(String[] args) throws IOException {

		DemoClass demoClass = new DemoClass();
		Scanner scanner1 = new Scanner(System.in);
		demoClass.setEmployeeCity(scanner1.nextLine());
		demoClass.setEmployeeName(scanner1.nextLine());

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		Scanner scanner = null;
		FileInputStream fileInputStream = null;

		try {
			fos = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA IODemo files\\OutputFile.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(demoClass);
			System.out.println("Child class object serialized");
			
			//printing the file contents
			fileInputStream = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA IODemo files\\OutputFile.txt");
			scanner = new Scanner(fileInputStream);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fos.close();
			oos.close();
		}
	}

}

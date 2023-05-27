package com.test;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMain {

	
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Serialization start");
		//creating object of DemoSeria
		DemoSerialization demo = new DemoSerialization();
		
		//create the object of fileoutputstream
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\OutputFile.txt");
		
		//serializing object
		// creating object of object output stream
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//write the serializable class object
		oos.writeObject(demo);
		System.out.println("Serialization end");
		
		
		System.out.println("Deserialization start");
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\OutputFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		DemoSerialization demo1 = (DemoSerialization) object;
		System.out.println("A = "+ demo1.a);
		System.out.println("B = "+ demo1.b);
		System.out.println("Deserialization ends");
		
	}
	
	
}

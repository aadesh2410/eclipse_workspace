package com.test;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OutputStream {

	public static void main(String[] args) throws IOException {

		FileWriter fw = null;
		//Scanner scanner = null;

		try {

			fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\OutputFile.txt");
			
			fw.write("HEllo, FIle writing");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fw.close();
		}

	}

}

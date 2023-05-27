package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputStream {

	// read input/data from the file
	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = null;
		Scanner scanner = null;

		try {
			// create input stream to read the file
			fileInputStream = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Example.txt");
			// scan the input stream
			scanner = new Scanner(fileInputStream);

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				fileInputStream.close();
				scanner.close();
		}
	}
}

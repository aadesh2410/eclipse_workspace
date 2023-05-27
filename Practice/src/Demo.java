import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//read from one file and write into another file
public class Demo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		FileWriter fw = null;
		Scanner scanner = null;
		try {

			fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\OutputFile.txt");
			fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\Example.txt");
			scanner = new Scanner(fis);
			while (scanner.hasNextLine()) {
				// printing on the console
				// System.out.println(scanner.nextLine());
				// fw.write(scanner.nextLine());
				fw.write(scanner.nextLine());
			}
			System.out.println("File copying done");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
			fw.close();
			scanner.close();

		}

	}

}

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	
	public static void main(String[] args) {
		
		
		ArrayList<Student> aList = new ArrayList<Student>();
		aList.add(new Student(101, "Aadesh", 94));
		aList.add(new Student(104, "Vaibhav", 86));
		aList.add(new Student(102, "Jayesh", 91));
		aList.add(new Student(103, "Vinita", 99));
		aList.add(new Student(105, "Aditya", 100));
		aList.add(new Student(106, "Rashmi", 0));
		aList.add(new Student(107, "Aadesh", 54));
		aList.add(new Student(108, "Rashmi", 76));
		
		
		System.out.println("Before sorting >> "+aList);
		
		Collections.sort(aList, new NameComparatorStudent());
		for(Student student:aList) {
			System.out.println(student);
		}
		Collections.sort(aList, new IdComparatorStudent());
		for(Student student:aList) {
			System.out.println(student);
		}
		Collections.sort(aList, new CustomizedComparatorStudent());
		for(Student student:aList) {
			System.out.println(student);
		}
	}
}

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain{

	

	
	public static void main(String[] args) {
	
		ArrayList<Employee> aList = new ArrayList<>();
		aList.add(new Employee(12, "Aadesh", "Pune"));
		aList.add(new Employee(14, "Poonam", "Indore"));
		aList.add(new Employee(10, "Psreshs", "Mumbai"));
		aList.add(new Employee(11, "vaibhav", "delhi"));
		
		System.out.println("Before sorting >> "+ aList);
		
		//without compareTo implementation, error is shown
		Collections.sort(aList);
		
		System.out.println("After sorting >> "+ aList);
		
	}
}

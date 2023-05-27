package com.demo;


//return a list of employee class
import java.util.ArrayList;

public class ArrayListDemo8 {

	//arrayList referance can be given to List 
	public ArrayList<EmployeeForDemo7> getEmployeeList(ArrayList<EmployeeForDemo7> arrayList){
		ArrayList<EmployeeForDemo7> alist1 = new ArrayList<EmployeeForDemo7>();
		alist1.addAll(arrayList);
		alist1.add(new EmployeeForDemo7(25, "Aboli", 60000));
		return alist1;
	}
	
	
}

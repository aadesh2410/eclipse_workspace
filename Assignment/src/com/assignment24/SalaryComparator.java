package com.assignment24;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return o1.getSalary() - o2.getSalary();
	}

}

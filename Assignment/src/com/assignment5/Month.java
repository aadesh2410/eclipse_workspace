package com.assignment5;

public class Month {
	
	public static void main(String[] args) {
		String month_name = "May";
		switch(month_name) {
		case "January":
			System.out.println("Month of January"+"\n"+"Happy Republic Day");
			break;
		case "February":
			System.out.println("Month of February"+"\n"+"Let me know if its a leap year !!");
			break;
		case "March":
			System.out.println("Month of March"+"\n"+"May be happy holi");
			break;
		case "April":
			System.out.println("Month of April"+"\n"+"Happy fooling month");	
			break;
		case "May":
			System.out.println("Month of May"+"\n"+"Summer is here");
			break;
		case "June":
			System.out.println("Month of June"+"\n"+"Month of the longest day");
			break;
		case "July":
			System.out.println("Month of July"+"\n"+"Rain rain go away");
			break;
		case "August":
			System.out.println("Month of August"+"\n" + "Jai Hind");
			break;
		case "September":
			System.out.println("Month of September"+"\n"+"No significance");
			break;
		case "October":
			System.out.println("Month of October"+"\n"+"Bring on the lights");
			break;
		case "November":
			System.out.println("Month of November"+"\n"+"No nuts november");
			break;
		case "December":
			System.out.println("Month of December"+"\n"+"Lord o' Jesus");
			break;
		default:
			System.out.println("Ooopssss"+"\n"+"PLease enter a valid English month");
			break;
		}
		
	}
}

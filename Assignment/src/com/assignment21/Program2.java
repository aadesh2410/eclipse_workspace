package com.assignment21;

import java.util.ArrayList;


/*
 * 2.Suppose I have one container that contain  different colors of ballons such as 
 * Red, Blue, Green, Red,Blue,Red, Blue, Green in this order, now sort that baloon 
 * in such manner so Red balloon will be added first then Blue baloon and last is Green balloons.
 *  Use the proper collection.
 */
public class Program2 {

	public static void main(String[] args) {

		ArrayList<String> ballonList = new ArrayList<>();
		ballonList.add("Red");
		ballonList.add("Blue");
		ballonList.add("Green");
		ballonList.add("Red");
		ballonList.add("Blue");
		ballonList.add("Red");
		ballonList.add("Blue");
		ballonList.add("Green");

		
		//Collections.sort(ballonList);
		ArrayList<String> sortedList = new ArrayList<>();
		for (String string : ballonList) {
			if (string.equals("Red")) {
				sortedList.add("Red");
			}
		}
		for (String string : ballonList) {
			if (string.equals("Blue")) {
				sortedList.add("Blue");
			}
		}
		for (String string : ballonList) {
			if (string.equals("Green")) {
				sortedList.add("Green");
			}
		}
		for (String string : sortedList) {
			System.out.println(string);
		}
	}
}

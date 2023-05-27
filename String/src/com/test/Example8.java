package com.test;

public class Example8 {

	public static void main(String[] args) {
		
		//string buffer class
		StringBuffer sb = new StringBuffer("Aadesh");
		
		System.out.println(sb.substring(1,6));
		sb.append(" More");
		System.out.println(sb);
		
		//StringBuillder class
		StringBuilder sBuilder = new StringBuilder("Rajendra");
		sBuilder.append(sb);
		System.out.println(sBuilder);
	}
}

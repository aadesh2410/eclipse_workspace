package com.demo;

import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack.size());
		for (int i = stack.size()-1; i >= 0; i--) {
			stack2.push(stack.elementAt(i));
		}

		System.out.println(stack2);
	}
}

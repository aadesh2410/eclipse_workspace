
package com.practice;

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Gfg {

	static ArrayList<Integer> getSum(int N) {
		// code here

		int even_sum = 0, odd_sum = 0;
		ArrayList<Integer> result = new ArrayList<>();

		even_sum = N * (N + 1);
		result.add(even_sum);
		
		odd_sum = N * N;
		result.add(odd_sum);

		//System.out.println(result);
		return result;
	}

	public static void main(String args[]) throws IOException {
		Scanner scn = new Scanner(System.in);
		// int t = scn.nextInt();
		// while (t-- > 0) {
		// int N = scn.nextInt();
		int N = 10;
		// Solution ob = new Solution();
		ArrayList<Integer> sum = getSum(N);
		System.out.println(sum.get(0) + " " + sum.get(1));
		// }
	}
}
// } Driver Code Ends

//User function Template for Java

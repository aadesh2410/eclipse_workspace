package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Gfg2 {
	    public static void main(String args[]) throws IOException {
	    		
	    		int n = 5;
	    		int k = 6;
	    		int arr[] = new int[]{1,3,5,7,8};
	    		
	    		System.out.println("Hiie ");
	            Solution ob = new Solution();
	            System.out.println(Solution.javaIterator(n,k,arr));
	        }
	    }
	
	// } Driver Code Ends




	class Solution {
	    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
	       ArrayList<Integer> arraylist = new ArrayList<>();
	       for(int i = 0 ; i  < n ; i++){
	           arraylist.add(arr[i]);
	       }
	       System.out.println(arraylist.size());
	       System.out.println(arraylist);
//	       for(Integer integer: arraylist){
//	           if( integer < k){
//	               arraylist.remove(integer);
//	           }
//	       }
	       
	       for(int i = 0; i < 5;i++) {
	    	   if( arraylist.get(i) < k){
	               arraylist.remove(i);
	               i--;
	               System.out.println(arraylist);
	           }
	       }
	       
	       
	       
	       return arraylist;
	    }
	};

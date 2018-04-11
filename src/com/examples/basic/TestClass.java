package com.examples.basic;

import java.util.Scanner;
import java.util.regex.*;

public class TestClass {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in) ;
        
		int n = in.nextInt() ;
        String password = in.next() ;
        int answer = minimumNumber(n, password) ;
        System.out.println(answer) ;
        
        in.close();
	}

	protected static int minimumNumber(int n, String password) {
		
		int additionalCharsRequired = 0 ;
		        
        additionalCharsRequired += Pattern.matches(".*\\d.*", password) ? 0 : 1 ;
        additionalCharsRequired += Pattern.matches(".*[a-z].*", password) ? 0 : 1 ;
		additionalCharsRequired += Pattern.matches(".*[A-Z].*", password) ? 0 : 1 ;
        additionalCharsRequired += Pattern.matches(".*\\W.*" , password) ? 0 : 1 ;
        additionalCharsRequired += (password.length() + additionalCharsRequired) >= 6 ? 0 :  ((6 - additionalCharsRequired) - password.length()) ;
        
        return additionalCharsRequired ;
    }
	
	protected static int camelcase(String s) {
		
        StringBuilder sb = new StringBuilder(s) ;
        int strCount = 1 ;
        
        for (int i = 0; i < sb.length(); i++) {
        	if (Character.isUpperCase(sb.charAt(i))) {
        		strCount++ ;
        	}
        }
        return strCount ;
    }
	
	protected static String super_reduced_string(String s) {
		
		StringBuilder strBuilder = new StringBuilder(s) ;
		
		for (int i = 1; i < strBuilder.length(); i++) {
			if (strBuilder.charAt(i) == strBuilder.charAt(i-1)) {
				strBuilder.delete(i-1, i+1) ;
				i = 0 ;
			}
		}
		return strBuilder.toString() ;
	}
	
	protected static void insertionSort1(int n, int[] arr) {

		int totalShifts = 0;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			for (int j = i - 1; j >= 0 && key < arr[j]; j--) {
				arr[j + 1] = arr[j + 1] + arr[j];
				arr[j] = arr[j + 1] - arr[j];
				arr[j + 1] = arr[j + 1] - arr[j];
				++totalShifts;
			}
		}
		System.out.println(totalShifts);
	}
	
}

package com.datastructures.arrays.rotation;

import com.util.AlgoUtil;
import com.util.PrintUtil;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * 
 * This program rotates all the array elements by d (a positive integer) places.
 * The best time complexity of this program is O(n) and worst time complexity is O(n*d)
 * The best and worst space complexity of this program is O(1)
 *
 * @author rushikesh_chaubal.
 *         Created Jun 1, 2018.
 */
public class RotateLeft {
	
	@SuppressWarnings("javadoc")
	public static void main(String [] args) {
		Integer arr[] = {12, 24, 52, 423, 4, 33, 66, 22} ;		
		int rotateLeftBy = 2 ;
				
		PrintUtil.printArray(arr) ;
		new RotateLeft().rotate(arr, rotateLeftBy, arr.length) ;
		PrintUtil.printArray(arr) ;
	}
	
	
	/**
	 * A function to rotate arr[] of size n by d elements.
	 *
	 * @param arr
	 * @param d 
	 * @param n 
	 */
	public void rotate (Integer [] arr, int d, int n) {
		int gcd = AlgoUtil.getGCD(n, d) ;
		for (int i = 0; i < gcd; i++) {
			
			int temp = arr[i] ;
			int lastPos = 0 ;
			for (int j = d+i, k = i; j < n; j+=d, k+=d) {
				
				arr[k] = arr[j] ;
				lastPos = j ;
			}
			arr[lastPos] = temp ;
		}
	}

}

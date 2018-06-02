package com.datastructures.arrays.rotation;

import com.util.PrintUtil;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements using array reversal.
 * 
 * This program rotates all the array elements by d (a positive integer) places.
 * The best & worst time complexity of this program is O(n).
 * The best and worst space complexity of this program is O(1).
 *
 * Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
 * d = 2
 * Output : arr[] = [3, 4, 5, 6, 7, 1, 2]
 *
 * @author rushikesh_chaubal.
 *         Created Jun 2, 2018.
 */
public class ReversalAlgoForArrayRotation {

	
	@SuppressWarnings("javadoc")
	public static void main(String [] args) {
		Integer arr[] = {12, 24, 52, 423, 4, 33, 66, 22} ;		
		int rotateLeftBy = 2 ;
				
		PrintUtil.printArray(arr) ;
		
		ReverseArray reverseArray = new ReverseArray() ;
		reverseArray.reverse(arr, 0, rotateLeftBy) ;
		reverseArray.reverse(arr, rotateLeftBy, arr.length) ;
		reverseArray.reverse(arr, 0, arr.length) ;
		PrintUtil.printArray(arr) ;
	}
	
	
}

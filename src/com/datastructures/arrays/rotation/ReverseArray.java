package com.datastructures.arrays.rotation;

import com.util.AlgoUtil;
import com.util.PrintUtil;

/**
 * This program reverses all the array elements
 *
 * @author rushikesh_chaubal.
 *         Created Jun 2, 2018.
 */
public class ReverseArray {
	@SuppressWarnings("javadoc")
	public static void main(String [] args) {
		Integer arr[] = {12, 24, 52, 423, 4, 33, 66, 22} ;		
				
		PrintUtil.printArray(arr) ;
		new ReverseArray().reverse(arr, 0, arr.length) ;
		PrintUtil.printArray(arr) ;
	}
	
	
	/**
	 * A function to reverse arr[] of size n.
	 *
	 * @param arr
	 * @param startPos 
	 * @param stopPos 
	 */
	public void reverse (Integer [] arr, int startPos, int stopPos) {
		for (int i = startPos, j = stopPos-1; i < j; i++, j--) {
			
			arr[i] = arr[i] + arr[j] ;
			arr[j] = arr[i] - arr[j] ;
			arr[i] = arr[i] - arr[j] ;
		}
	}
} 

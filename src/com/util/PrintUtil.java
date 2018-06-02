package com.util;

/**
 * A print utility class
 *
 * @author rushikesh_chaubal.
 *         Created Jun 2, 2018.
 */
public class PrintUtil {

	/**
	 * 
	 * Function for printing all the elements of the passed in array.
	 *
	 * @param arr
	 */
	public static <E> void printArray(E [] arr) {
		
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

package com.datastructures.arrays.rotation;

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
		int arr[] = {12, 24, 52, 423, 4, 33, 66, 22} ;		
		int rotateLeftBy = 2 ;
		
		/*for (int i = 0; i < rotateLeftBy; i++) {
			int temp = arr[0] ;
			
			for (int j = 1; j < arrayLength; j++) {
				arr[j-1] = arr[j];
			}
			
			arr[arrayLength-1] = temp ;
		}*/
		
		
		int gcd = getGCD(arr.length, rotateLeftBy) ;
		printArray(arr) ;
		for (int i = 0; i < gcd; i++) {
			
			int temp = arr[i] ;
			int lastPos = 0 ;
			for (int j = rotateLeftBy+i, k = i; j < arr.length; j+=rotateLeftBy, k+=rotateLeftBy) {
				
				arr[k] = arr[j] ;
				lastPos = j ;
			}
			arr[lastPos] = temp ;
		}
		printArray(arr) ;
	}

	
	/**
	 * 
	 * Function for fetching GCD of two numbers.
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	protected static int getGCD(int a, int b) {
		int gcd = 1 ; 
		for (int i = 1; i <= a && i <= b; i++) {
			if ((a % i == 0) && (b % i == 0)){
				gcd = i ;
			}
		}
		return gcd ;
	}
	
	
	/**
	 * 
	 * Function for printing all the elements of the passed in array.
	 *
	 * @param arr
	 */
	protected static void printArray(int [] arr) {
		
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

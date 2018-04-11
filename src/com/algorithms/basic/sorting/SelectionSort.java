package com.algorithms.basic.sorting;

/**
 * Selection sort - If we want to arrange an array in ascending order then 
 * it functions by finding the smallest element and exchanging it with the 
 * first element, and repeat the following process on the sub-arrays till 
 * the whole list is sorted.
 * 
 * It is a linear sort algorithm.
 *
 * It has best, worst and average case performance of O(n2). 
 * 
 * Space required is O(n) as operations are performed directly on the array
 * and no additional space is used.
 * 
 * Not appropriate for large unsorted data sets. Ok for small & nearly sorted sets.
 * 
 * Performs better than bubble but worse than insertion sort.
 * 
 * Used if comparisions are really cheap and swaps are expensive. It will 
 * perform better when minimal space is available. So in this case it 
 * will perform better than merge sort.
 * 
 * Sorting occurs from left to right -> min to max.
 * 
 * @author rushikesh_chaubal.
 *         Created Apr 10, 2018.
 */
public class SelectionSort {

	@SuppressWarnings("javadoc")
	public static void main (String [] args) {
		
		int [] arr = {5, 1, 12, -5, 16, 2, 12, 14} ;
		printArray (arr, "original") ;
		
		arr = selectionSort (arr) ;
		printArray (arr, "sorted") ;
	}
	
	/**
	 * Method for printing the passed in array.
	 *
	 * @param arr
	 * @param orderStr 
	 */
	protected static void printArray (int [] arr, String orderStr) {
		
		System.out.print("Nos. in " + orderStr + " order: ") ;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ") ;
		}
		System.out.println(" ") ;
	}
	
	
	/**
	 * Method for sorting the passed in array using the selection sort algorithm.
	 *
	 * @param arr
	 * @return
	 */
	protected static int[] selectionSort (int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					arr[i] = arr[i] + arr[j] ;
					arr[j] = arr[i] - arr[j] ;
					arr[i] = arr[i] - arr[j] ;
				}
			}
			printArray(arr, "sorting") ;
		}
		return arr ;
	}
	
}

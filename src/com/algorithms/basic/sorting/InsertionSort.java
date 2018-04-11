package com.algorithms.basic.sorting;

/**
 * Insertion sort - Sorts each item in the array as they are encountered.
 * As the current item works from left to right, everything left to the item is 
 * known to be sorted while everything to the right is unsorted.  The current 
 * item is inserted into an appropriate place within the sorted section. 
 * 
 * It is a linear sort algorithm.
 * 
 * Has best case performance of O(n), worst and average case performance of O(n2). 
 * 
 * Space required is O(n) as operations are performed directly on the array
 * and no additional space is used.
 * 
 * Not appropriate for large unsorted data sets. Ok for small & nearly sorted sets.
 * 
 * Because of lesser no. of comparisons required, this algorithm performs better 
 * than selection sort & bubble sort if the array is mostly sorted.  
 *  
 * Used if comparisions are really cheap and swaps are expensive. It will 
 * perform better when minimal space is available. So in this case it 
 * will perform better than merge sort.
 * 
 * Sorting occurs left to right -> min to max.
 *
 * @author rushikesh_chaubal.
 *         Created Apr 10, 2018.
 */
public class InsertionSort {

	@SuppressWarnings("javadoc")
	public static void main (String [] args) {
		
		int [] arr = {1, 4, 7, 3, 35, 25, 100, 74} ;
		printArray (arr, "original") ;
		
		arr = insertionSort (arr) ;
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
	 * Method for sorting the passed in array using the insertion sort algorithm.
	 *
	 * @param arr
	 * @return
	 */
	protected static int[] insertionSort (int [] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i] ;
			for (int j = i-1; j >= 0 && arr[j] > key; j--) {
				arr[j+1] = arr[j+1] + arr[j] ;
				arr[j] = arr[j+1] - arr[j] ;
				arr[j+1] = arr[j+1] - arr[j] ; 
			}
			printArray(arr, "sorting") ;
		}
		return arr ;
	}

}

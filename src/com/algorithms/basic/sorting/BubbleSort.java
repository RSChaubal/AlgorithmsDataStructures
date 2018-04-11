package com.algorithms.basic.sorting;

/**
 * Bubble sort - If we want to arrange an array in ascending order then 
 * it functions by finding the smallest element and exchanging it with the 
 * first element, and repeat the following process on the sub-arrays till 
 * the whole list is sorted.
 *
 * It is a linear sort algorithm.
 *
 * Has best case performance of O(n), worst and average case performance of O(n2). 
 * For a sorted list, one should terminate the program checking if no exchanges are
 * required. Then in this case, the program would require only one pass and 
 * max (n-1) comparisons would be required in that single pass. So in that case, we 
 * would be able to say that the complexity is of order of O(n).
 * 
 * Space required is O(n) as operations are performed directly on the array
 * and no additional space is used.
 * 
 * Not appropriate for large unsorted data sets. Ok for small & nearly sorted sets.
 * 
 * Performs better than selection sort if the array is mostly sorted,  
 * because the correct element will fall into its place in the first 
 * iteration itself.
 * 
 * Used if comparisions are really cheap and swaps are expensive. It will 
 * perform better when minimal space is available. So in this case it 
 * will perform better than merge sort.
 * 
 * Sorting occurs right to left -> max to min.
 *
 * @author rushikesh_chaubal.
 *         Created Apr 10, 2018.
 */
public class BubbleSort {

	@SuppressWarnings("javadoc")
	public static void main (String [] args) {
		
		int [] arr = {3, 7, 4, 4, 6, 5, 8} ;
		printArray (arr, "original") ;
		
		arr = bubbleSort (arr) ;
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
	 * Method for sorting the passed in array using the bubble sort algorithm.
	 *
	 * @param arr
	 * @return
	 */
	protected static int[] bubbleSort (int [] arr) {
		
		for (int i = 0; i < (arr.length - 1); i++) {
			for (int j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j + 1] < arr[j]) {
					arr[j+1] = arr[j] + arr[j+1] ;
					arr[j] = arr[j+1] - arr[j] ;
					arr[j+1] = arr[j+1] - arr[j] ;
				}
			}
			printArray(arr, "sorting") ;
		}
		return arr ;
	}
	
}

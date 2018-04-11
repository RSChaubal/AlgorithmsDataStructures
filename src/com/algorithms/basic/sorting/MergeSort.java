package com.algorithms.basic.sorting;

/**
 * Merge sort - The array is recursively split into half. When the 
 * array is in groups of 1, it is reconstructed in sorted order. 
 * Each reconstructed array is merged into the other half.
 * 
 * It is a divide and concur algorithm.
 *
 * It has best, worst and average case performance of O(n log n). 
 * 
 * Space required is O(n). Merge sort can be, but is often not, perfomed
 * in-place. These extra allocations increase the memory foot print.
 * 
 * It is appropriate for large unsorted data sets. Data splitting gives 
 * us the ability to sort data in parallel. 
 * 
 * At the same time, due to the fixed nature of splitting and combining 
 * the array irrespective of whether it is in sorted order or not, it is 
 * not suited for sorted data.
 * 
 * While using it, ensure that the implementation does in-place sorting
 * else a large data set with lots of split array allocation can impact 
 * the rate of garbage collection and in-turn the performance of the 
 * algorithm. 
 * 
 * @author rushikesh_chaubal.
 *         Created Apr 10, 2018.
 */
public class MergeSort {

	@SuppressWarnings("javadoc")
	public static void main (String [] args) {
		
		int [] arr = {1, 4, 7, 3, 35, 25, 100, 74} ;
		printArray (arr, "original") ;
		
		arr = mergeSort (arr) ;
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
	 * Method for sorting the passed in array using the merge sort algorithm.
	 *
	 * @param arr
	 * @return
	 */
	protected static int[] mergeSort (int [] arr) {
		
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

package com.algorithms.basic.sorting;

/**
 * Quick sort - It works by picking up a pivot value and partioning the array.
 * Then all the values before the pivot are put to its left and all the values
 * above the pivot are put to its right. Then again partions are performed on 
 * the left and the right of the pivot elements. This process is repeated over
 * and over again till all the elements are sorted.
 *
 * It is a divide and concur algorithm.
 *
 * Has worst case performance of O(n2), which is, if the array is large
 * pathologically sorted data set. 
 * 
 * Its average case and best case performance is O(nlogn), which makes
 * it appropriate for large as well as small data sets. 
 * 
 * Space required is O(n) as operations are performed directly on the array
 * and no additional space is used.
 * 
 * @author rushikesh_chaubal.
 *         Created Apr 10, 2018.
 */
public class QuickSort {

	@SuppressWarnings("javadoc")
	public static void main (String [] args) {
		
		// int [] arr = {1, 4, 7, 3, 35, 25, 100, 74} ;
		int [] arr = {10, 11, 44, 6, 2, 44, 70, 25} ;
		printArray (arr, "original") ;
		
		arr = quickSort (arr, 0, arr.length - 1) ;
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
	 * Method for sorting the passed in array using the quick sort algorithm.
	 *
	 * @param arr
	 * @param low 
	 * @param high 
	 * @return
	 */
	protected static int[] quickSort (int [] arr, int low, int high) {
		
		if (low < high) {
			int pivot = partition (arr, low, high) ;
			
			quickSort (arr, pivot+1, high) ;
			quickSort (arr, low, pivot-1) ;
		}
			
		return arr ;
	}
	
	
	/**
	 * Method for partitioning the array based on the pivot element.
	 *
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	protected static int partition (int [] arr, int low, int high) {
		
		int i = low - 1 ;
		
		for (int j = low; j < high; j++) {
			if (arr[j] < arr[high] && arr[++i] != arr[j]) {
				arr[j] = arr[j] + arr[i] ;
				arr[i] = arr[j] - arr[i] ;
				arr[j] = arr[j] - arr[i] ;
			}
		}
		
		arr[high] = arr[high] + arr[i+1] ;
		arr[i+1] = arr[high] - arr[i+1] ;
		arr[high] = arr[high] - arr[i+1] ;
		
		return i+1 ;
	}

}

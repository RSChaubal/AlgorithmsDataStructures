package com.util;

/**
 * An Algo utility class.
 *
 * @author rushikesh_chaubal.
 *         Created Jun 2, 2018.
 */
public class AlgoUtil {

	/**
	 * 
	 * Function for fetching GCD of two numbers.
	 *
	 * @param a
	 * @param b
	 * 
	 * @return
	 */
	public static int getGCD(int a, int b) {
		int gcd = 1 ; 
		for (int i = 1; i <= a && i <= b; i++) {
			if ((a % i == 0) && (b % i == 0)){
				gcd = i ;
			}
		}
		return gcd ;
	}
}

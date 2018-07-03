package com.examples.basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * TODO Put here a description of what this class does.
 *
 * @author rushikesh_chaubal.
 *         Created Apr 17, 2018.
 */
public class ModifiedFibonacci {

    @SuppressWarnings("javadoc")
	static BigInteger fibonacciModified(int t1, int t2, int n) {
        
    	BigInteger a = BigInteger.valueOf(t1), b = BigInteger.valueOf(t2), c = BigInteger.ZERO ;
    	
    	for (int i = 0; i < n-2; i++) {
    		c = a.add(b.multiply(b)) ;
    		a = b ;
    		b = c ;
    	}
    	return c ;
    }

    @SuppressWarnings("javadoc")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        BigInteger result = fibonacciModified(t1, t2, n);
        System.out.println(result.toString());
        in.close();
    }
}

package com.lambda.expressions;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * TODO Put here a description of what this class does.
 *
 * @author rushikesh_chaubal.
 *         Created Jul 3, 2018.
 */
public class PredicateLambda {
	
	@SuppressWarnings("javadoc")
	public static void main(String [] args) {
		
		// Arrays.asList("one", "two", "three", "four", "five").stream().filter(s -> s.equals("two")).forEach(System.out::println) ;
		
		Predicate<String> p1 = (s) -> s.equals("two") ;
		Predicate<String> p2 = (s) -> s.length() == 4 ;
		Arrays.asList("one", "two", "three", "four", "five").stream().filter(p1.or(p2)).forEach(System.out::println) ;
	}
}

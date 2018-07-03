package com.lambda.expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * TODO Put here a description of what this class does.
 *
 * @author rushikesh_chaubal.
 *         Created Jul 3, 2018.
 */
public class ConsumerChainLambda {

	@SuppressWarnings("javadoc")
	public static void main(String [] args) {
		
		List<String> list = Arrays.asList("one", "two", "three", "four", "five") ;
		List<String> results = new ArrayList<String>() ;
		
		Consumer<String> cons = s -> System.out.println(s) ;
		Consumer<String> cons2 = s -> results.add(s) ;
		
		list.forEach(cons.andThen(cons2)) ;
		
		System.out.println("Results list size: " + results.size()) ;
	}
}

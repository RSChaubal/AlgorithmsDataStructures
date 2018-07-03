package com.lambda.expressions;

import java.util.Arrays;

/**
 * TODO Put here a description of what this class does.
 *
 * @author rushikesh_chaubal.
 *         Created Jul 3, 2018.
 */
public class StreamLambda {

	@SuppressWarnings({ "javadoc" })
	public static void main(String [] args) {
		
		/*List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five") ;
		
		Stream stream = list.stream() ;
		
		stream.forEach(s -> System.out.println(s)) ;*/
		
		Arrays.asList("One", "Two", "Three", "Four", "Five").stream().forEach(System.out::println) ;
	}
}



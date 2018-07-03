package com.lambda.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * TODO Put here a description of what this class does.
 *
 * @author rushikesh_chaubal.
 *         Created Jul 4, 2018.
 */
public class LazyPeekLambda {
	
	@SuppressWarnings("javadoc")
	public static void main(String [] args) {
		
		Stream<String> stream = Stream.of("one", "two", "three", "four", "five") ;
		
		Predicate<String> p1 = (s) -> s.length() == 4 ;
		Predicate<String> p2 = (s) -> s.equals("two") ;
		
		List<String> results = new ArrayList<>() ;
		
		// Peek is an intermediary function and hence it is lazy operated
		// meaning that it wouldn't be called unless a call to a final   
		// function is made. It returns a stream which can be further 
		// operated on.
		/*stream
				.peek(s -> results.add(s))
				.filter(p1.or(p2))
				.peek(System.out::println) ;
		
		System.out.println("Results array size = " + results.size()) ;*/
		
		// ForEach is similar to peek but it is not an intermediary 
		// function. Hence it is not lazy operated. It does not return 
		// anything.
		stream
		.peek(s -> results.add(s))
		.filter(p1.or(p2))
		.forEach(System.out::println) ;

		System.out.println("Results array size = " + results.size()) ;
		
	}
}

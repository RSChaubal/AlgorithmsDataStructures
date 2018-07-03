package com.lambda.expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * TODO Put here a description of what this class does.
 *
 * @author rushikesh_chaubal.
 *         Created Jul 4, 2018.
 */
public class FlatMapLambda {
	
	
	@SuppressWarnings("javadoc")
	public static void main(String [] args) {
		
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7) ;
		List<Integer> l2 = Arrays.asList(2, 4, 6) ;
		List<Integer> l3 = Arrays.asList(3, 5, 7) ;
		
		List<List<Integer>> l4 = Arrays.asList(l1, l2, l3) ;
		
		System.out.println(l4) ;
		
		// Input interface for map is of type - Function
		// l4.stream().map(l -> l.size()).forEach(System.out::println) ;
		
		Function<List<?>, Integer> size = List::size ;
		l4.stream().map(size).forEach(System.out::println) ;
		
		Function<List<Integer>, Stream<Integer>> flatmapper = l -> l.stream() ;
		l4.stream().map(flatmapper).forEach(System.out::println) ;
		
		// Flat map flattens a stream of streams to a normal stream.
		l4.stream().flatMap(flatmapper).forEach(System.out::print) ;
	}

}

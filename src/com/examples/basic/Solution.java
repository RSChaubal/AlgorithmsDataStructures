package com.examples.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer> () ;
        
        int max = 1 ;
        for (int i = 0; i < arr.length; i++) {
        	int count = map.compute(arr[i], 
        		    (k, v) -> v == null ? 1 : ++v) ;
        	if (max < count) {
        		max = count ;
        	}
        }
        return arr.length - max ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}

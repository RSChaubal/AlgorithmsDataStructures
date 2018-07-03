package com.lambda.expressions;

import java.io.File;
import java.io.FileFilter;

/**
 * TODO Put here a description of what this class does.
 *
 * @author rushikesh_chaubal.
 *         Created Jul 3, 2018.
 */
public class FileFilterLambda {
	
	@SuppressWarnings("javadoc")
	public static void main(String [] args) {
		
		// Old anonymous class.
		/* FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java") ;
			}
		} ; */
		
		// Lambda expression for reducing the anonymous class code. It makes it easier to
		// write the anonymous class code.
		FileFilter fileFilter = (File pathname) -> pathname.getName().endsWith(".java") ;
		
		File fileDir = new File("C:/Users/rushikesh_chaubal/workspace/Examples/src/com/util")  ;
		File [] files = fileDir.listFiles(fileFilter) ;
		
		for (File file : files) {
			System.out.println(file) ;
		}
	}

}

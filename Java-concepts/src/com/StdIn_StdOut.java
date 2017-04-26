package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/*
 * 
 *  StdIn ==> system default input source ( e.g keyboard )
 *  StdOut ==> console
 * 
 */

public class StdIn_StdOut {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("in console");
		
		System.setOut(new PrintStream("output.txt"));
		
		System.out.println("u cant see in cole..");

	}

}

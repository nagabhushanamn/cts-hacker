package com;

public class Java_Output_Formatting {

	public static void main(String[] args) {

		int total = 1234;

		String output = String.format("%05d", total);
		System.out.println(output);

		
		System.out.printf("This is %d",12);
	}

}

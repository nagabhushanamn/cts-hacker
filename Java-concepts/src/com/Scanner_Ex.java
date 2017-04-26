package com;

import java.util.Scanner;

public class Scanner_Ex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Num");
		double d=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Name");
		String str=sc.nextLine();
		
		System.out.println(d);
		System.out.println(str);
		
		// ??

	}

}

package com;

import javax.swing.text.AsyncBoxView.ChildLocator;

/*
 * 
 *  String
 *  StringBuffer
 *  StringBuilder
 * 
 * 
 * 
 *  special memory for strings ==> SCP ( String Constant Pool )
 *  
 *  	--> allocated memory
 *  --> never hold duplicate strings
 * 
 * 
 * 
 * 
 * 	by default
 * 
 *    ==> strings immutable
 *    
 *    
 */

public class Java_String_Handling {

	public static void main(String[] args) {

		// String s1 = "cts";
		// String s2 = "cts";
		//
		// System.out.println(s1 == s2);
		// System.out.println(s1.equals(s2));

		// ---------------------------------

		//
		// String s3=new String("cts");
		// String s4=new String("cts");
		//
		// System.out.println(s3==s4);
		// System.out.println(s3.equals(s4));

		// ---------------------------------

		// String food="chicken";
		// String newFood=food.concat("-biryani");
		// System.out.println(food);
		// System.out.println(newFood);

		// ---------------------------------

		// String methods

		String str = "abcd";
		System.out.println();

		// System.out.println(str.charAt(8));

		System.out.println(str.startsWith("ab"));
		System.out.println(str.endsWith("cd"));
		System.out.println(str.contains("bc"));

		// String comparision methods

		// equals() , compareTo()

		// String s1="cts";
		// String s2="CTs";
		// System.out.println(s1.compareTo(s2));
		//

		// ---------------------------------------
		//
	}

}

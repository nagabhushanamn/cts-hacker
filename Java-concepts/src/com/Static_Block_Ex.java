package com;

class Abc {

	static {

		// why we need ?

		/*
		 * --> to initialize static var with some runtime expressions 
		 * --> to create Factory-level objects once. 
		 * --> To load/register any Driver(s)
		 * 
		 *
		 */

		System.out.println("Abc.static block-1");

	}
	static {
		System.out.println("Abc.static block-2");
	}

	public static void mm() {
		System.out.println("im Abc");
	}

	public void m() {
		System.out.println("im Abc");
	}
}

public class Static_Block_Ex {

	public static void main(String[] args) {

		Abc abc = null;

		// Abc.mm();

		abc = new Abc();
		abc = new Abc();

	}

}

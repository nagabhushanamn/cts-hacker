package com;

import com.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add("B");
		list.add("C");
		list.add("A");

		// ----------------------------------

		list.remove(1);

		// ----------------------------------

		for (Object ele : list) {
			System.out.println(ele);
		}

	}

}

package com;

import com.emp.JavaEmployee;

class A extends Object {
	public A(int a) {
		super();
		System.out.println("i am A");
	}
}

class B extends A {
	public B(int a) {
		super(a);
		System.out.println("i am B");
	}
}

class C extends B {
	public C(int a) {
		super(a);
		System.out.println("i am C");
	}
}

public class App {

	public static void main(String[] args) {

		// JavaEmployee javaEmployee = new JavaEmployee();
		// javaEmployee.id = 123;
		// javaEmployee.name = "Nag";
		// javaEmployee.javaSkill = "Spring";

		JavaEmployee javaEmployee = new JavaEmployee(123);

		// --------------------------------------------------

		// javaEmployee.id = 0;

		// --------------------------------------------------

		C c = new C(12);

	}

}

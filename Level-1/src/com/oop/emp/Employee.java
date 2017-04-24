
// package dec
package com.oop.emp;

// import statements

// public type
public class Employee {

	// state

	// a. class state

	public final static String COMP_NAME = "cts";
	public static String tnrName;

	// b. object state

	public int id;
	public String name;

	// constructor

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// behav

	// a. class behav

	public static void doTraining() {
		System.out.println("Employee : doTraing()");
	}

	// b. obj behav

	public void doWork() {
		System.out.println(this.name + " working...");
	}

	// inner class

}

// default type(s)

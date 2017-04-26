package com;

/*
 * 
 *  polymorphism
 *  --------------
 *  
 *  --> compile-time method binding  ==> method overloading
 *  --> runtime-time method binding  ==> method overriding ( Inheritance/Interface )
 *  
 * 
 */

class Actor {
	public void act() {
		System.out.println("No Act");
	}

	public void act(double amount) {
		System.out.println("Role-1...");
	}

	public void act(double amount, double commision) {
		System.out.println("Role1 + Role2 Act..");
	}
}

// --------------------------------------------

interface Wheel {
	void rotate();
}

class MRFWheel implements Wheel {
	@Override
	public void rotate() {
		System.out.println("MRF Wheel rotating");
	}
}

class JKWheel implements Wheel {
	@Override
	public void rotate() {
		System.out.println("JKWheel rotating...");
	}
}

class Car {

	Wheel wheel;

	public Car(Wheel wheel) {
		super();
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Car Moving...");
	}
}

public class Polymorphism {

	public static void main(String[] args) {

		Actor actor = new Actor();
		actor.act();
		actor.act(10000000.00);
		actor.act(1000.00, 1000);

		// -----------------------------------

		System.out.println(1);
		System.out.println("str");
		System.out.println(12.12);

		// -----------------------------------

		String str = "abcd";
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 3));

		// -----------------------------------
		
		Wheel wheel=new MRFWheel();
		Wheel jkWheel=new JKWheel();
		Car car=new Car(jkWheel);
		car.move();
	}

}

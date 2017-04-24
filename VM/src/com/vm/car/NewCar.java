package com.vm.car;

import com.vm.wheel.Wheel;

public class NewCar {

	private Wheel wheel;

	public NewCar(Wheel wheel) {
		super();
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Happy driving...");
	}

}

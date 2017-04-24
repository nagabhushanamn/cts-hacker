package com.vm;

import com.vm.car.NewCar;
import com.vm.wheel.Wheel;
import com.vm.wheel.mrf.MRFWheel;

public class AppDrive {

	public static void main(String[] args) {

		Wheel mrfWheel = new MRFWheel();
		NewCar car = new NewCar(mrfWheel);
		car.move();

	}

}

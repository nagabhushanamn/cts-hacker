package com.vm.wheel.mrf;

import com.vm.wheel.Wheel;

public class MRFWheel implements Wheel {

	@Override
	public void rotate() {
		System.out.println("MRF wheel rotating....");

	}

	public void internal() {
		System.out.println("Internal methods...");
	}

}

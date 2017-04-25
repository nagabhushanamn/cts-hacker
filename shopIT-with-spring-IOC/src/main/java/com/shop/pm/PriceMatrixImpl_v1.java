package com.shop.pm;

import org.springframework.stereotype.Component;

@Component("pmV1")
public class PriceMatrixImpl_v1 implements PriceMatrix {

	public double getPrice(String item) {
		// get price from db or ws-call
		return 100.00;
	}

}

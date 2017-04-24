package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// init-phase

		PriceMatrix priceMatrix_v1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrix_v2 = new PriceMatrixImpl_v2();
		Billing billingComp = new BillingImpl(priceMatrix_v2);

		// use-phase
		String[] cart = { "123123", "423123" };
		double total = billingComp.getTotalPrice(cart);
		System.out.println("Total: " + total);
		System.out.println("Happy shopping");

		// destory-phase
		// ( clean-up )

	}

}

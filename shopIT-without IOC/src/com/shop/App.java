package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init-phase

		BillingImpl billingComp = new BillingImpl();

		// use-phase
		String[] cart = { "123123", "423123" };
		double total = billingComp.getTotalPrice(cart);
		System.out.println("Total: " + total);
		System.out.println("Happy shopping");

		// destory-phase
		// ( clean-up )
		
	}

}

package com.shop.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shop.pm.PriceMatrix;

@Component("billing")
public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix;

	// public BillingImpl(PriceMatrix priceMatrix) {
	// super();
	// this.priceMatrix = priceMatrix;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shop.bill.Billing#getTotalPrice(java.lang.String[])
	 */
	@Override
	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		for (String item : cart) {
			//
			total += priceMatrix.getPrice(item);
		}

		return total;
	}

	public PriceMatrix getPriceMatrix() {
		return priceMatrix;
	}

	@Autowired
	@Qualifier("pmV1")
	public void setPriceMatrix(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

}

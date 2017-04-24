package com.shop.bill;

import com.shop.pm.PriceMatrix;

/*
 * 
 *  OO principle
 *  ---------------
 *  
 *  any component/obj , shud follow
 *  
 *  	" closed for modification , open for extension "
 *  
 *  
 *  
 *  design & performance issues
 *  ---------------------------
 *  
 *  --> tight-coupling
 *  --> too many dependecies created & destructed on repeated operations
 *  --> Unit-Testing not possible
 *  
 *  
 *  why these issues are raising ?
 *  
 *  ==> dependent's class creating dependency object
 *  
 *  soln:
 *  
 *  ==> dont create dependency in dependent's class , do Lookup
 *  
 *    Limitations on Lookup
 *    
 *    --> location tight-coupling
 *    
 *   the best soln:
 *   
 *    don't create/lookup dependency , get/inject thru 'some-one'  ( Inversion Of Control )
 *  
 *  
 *  		How to implement IOC ?
 *  
 *  	     --> using dependency injection ( DI )
 *  
 *  			--> constructor DI
 *          --> setter DI
 *  
 * 
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix;
	

	public BillingImpl(PriceMatrix priceMatrix) {
		super();
		this.priceMatrix = priceMatrix;
	}

	/* (non-Javadoc)
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

}

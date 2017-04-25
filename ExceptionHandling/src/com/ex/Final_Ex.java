package com.ex;

//  Account Txr Module -> from third-party

class AccountBalanceException extends RuntimeException{
	double currentBalance;

	public AccountBalanceException(double currentBalance) {
		super();
		this.currentBalance = currentBalance;
	}
	@Override
	public String getMessage() {
		return "No enough balance! current-balance: "+this.currentBalance;
	}
}
class TxrModule {
	public String toTxr(double amount,String fromAcc,String toAccNum){
		//
		// load from Acc
		// load to Acc
		double fromAccBalance=1000.00;
		if(amount>fromAccBalance){
			AccountBalanceException abe=new AccountBalanceException(fromAccBalance);
			throw abe;
		}
		// debit & credit
		// update Accounts
		return "status: success";
	}
}





public class Final_Ex {
	
	public static void main(String[] args) {
		
		// client-app
		
		TxrModule txrModule=new TxrModule();
//		try {
			String status=txrModule.toTxr(5000.00, "1", "2");
			System.out.println(status);
//		} catch (AccountBalanceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
